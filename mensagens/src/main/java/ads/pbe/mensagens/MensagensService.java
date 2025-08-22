package ads.pbe.mensagens;

import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

@Service
public class MensagensService {

    HashMap<String, ArrayDeque<String>> mensagens = new HashMap<>();

    public void publicar(String chave, String mensagem) {
        ArrayDeque<String> fila;

        if (mensagens.get(chave) == null) {
            fila = new ArrayDeque<>();
        } else {
            fila = mensagens.get(chave);
        }

        fila.add(mensagem);
        mensagens.put(chave, fila);
    }

    public String acessar(String chave) {
        ArrayDeque<String> fila;

        fila = mensagens.get(chave);

        if (fila == null) {
            return null;
        } else {
            fila.getFirst();
            return fila.remove();
        }
    }
}
