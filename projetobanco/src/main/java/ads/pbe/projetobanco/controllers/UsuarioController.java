package ads.pbe.projetobanco.controllers;

import ads.pbe.projetobanco.entidades.Usuario;
import ads.pbe.projetobanco.services.ServicoUsuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    record UserDados(String nome, String sobrenome){}

    private ServicoUsuario usuarioService;


    UsuarioController(ServicoUsuario servico) {
        this.usuarioService = servico;
    }

    @PostMapping("/criar")
    public ResponseEntity<String> cria(@RequestBody UserDados user) {
        usuarioService.cria(user.nome, user.sobrenome);
        return ResponseEntity.ok("Usuário criado");
    }

    @GetMapping("/buscarUser/{nome}")
    public ResponseEntity<Usuario> busca(@PathVariable("nome") String nome) {
        return ResponseEntity.ok(usuarioService.bucaPorNome(nome));
    }

    @GetMapping("/buscarTodosUser/{nome}")
    public ResponseEntity<List<Usuario>> buscaTodos(@PathVariable("nome") String nome) {
        return ResponseEntity.ok(usuarioService.bucaTodosComNome(nome));
    }
}
