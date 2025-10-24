package pbe;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

@RestController
public class SSEController {

    ArrayList<Set<ResponseBodyEmitter.DataWithMediaType>> eventos_anteriores = new ArrayList<>();

    ConcurrentHashMap<SseEmitter,Boolean> emitters = new ConcurrentHashMap<>();
    int cont = 0;

    /*
    Handles connection to the event service
    Starts a thread for each client.
     */
    @GetMapping("/noticias")
    public SseEmitter streamSseEvents() throws IOException {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
        emitters.put(emitter, true);
        emitter.onCompletion(() -> {emitters.remove(emitter);});
        emitter.onTimeout(() -> {emitters.remove(emitter);});

        for (var e: eventos_anteriores) {
            emitter.send(e);
        }

        return emitter;
    }

    @PostMapping("/envia")
    public void noticia(@RequestBody String noticia) throws IOException {
        cont++;
        var e = SseEmitter.event()
                .data(noticia)
                .name("noticia")
                .id(String.valueOf(cont))
                .build();
        eventos_anteriores.add(e);
        for (var cliente: emitters.keySet()) {
            cliente.send(e);
        }
    }
}