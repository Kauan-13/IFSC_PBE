package ads.pbe.mensagens;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MensagensController {

    record Mensagem(String conteudo){}

    private MensagensService mensagensService;

    public MensagensController(MensagensService service) {
        this.mensagensService = service;
    }

    record Teste(String algo, int limit) {}

    @PostMapping("/mostra")
    public String mostra(@RequestBody Teste query) {
        // Code to perform search
        return query.algo() + ": " + query.limit();
    }

    @PostMapping("/mensageiro/publica/{chave}")
    public String publicar(@PathVariable("chave") String chave, @RequestBody Mensagem mensagem) {
        mensagensService.publicar(chave, mensagem.conteudo());
        return chave + ": " + mensagem.conteudo();
    }

    @GetMapping("/mensageiro/acessa/{chave}")
    public ResponseEntity<String> acessa(@PathVariable("chave") String chave) {
        if (mensagensService.acessar(chave) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mensagensService.acessar(chave));
    }
}
