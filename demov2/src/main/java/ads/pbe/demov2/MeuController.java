package ads.pbe.demov2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MeuController {

    record DataAtual(String data){}
    record HoraAtual(String horario){}

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/data")
    public DataAtual get_data(){
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = dataAtual.format(formatter);

        return new DataAtual(data);
    }

    @GetMapping("/horario")
    public HoraAtual get_horario(){
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = horaAtual.format(formatter);

        return new HoraAtual(hora);
    }
}
