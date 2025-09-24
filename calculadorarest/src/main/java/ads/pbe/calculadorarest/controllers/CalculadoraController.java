package ads.pbe.calculadorarest.controllers;

import ads.pbe.calculadorarest.Services.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {

    record Resultado(Boolean sucesso, double resultado){}

    record Valor(double valor){}

    private final CalculadoraService calculadoraService;

    CalculadoraController(CalculadoraService service) {
        calculadoraService = service;
    }

    @GetMapping("/calculadora")
    public ResponseEntity<Resultado> calculadora(){
        return ResponseEntity.ok(new Resultado(true, calculadoraService.getAcc()));
    }

    @PutMapping("/calculadora/reinicio")
    public ResponseEntity<Resultado> reiniciar(){
        return ResponseEntity.ok(new Resultado(true, calculadoraService.limpar()));
    }

    @PutMapping("/calculadora/soma")
    public ResponseEntity<Resultado> somar(@RequestBody Valor valor){
        return ResponseEntity.ok(new Resultado(true, calculadoraService.somar(valor.valor)));
    }

    @PutMapping("/calculadora/subtracao")
    public ResponseEntity<Resultado> subtrair(@RequestBody Valor valor){
        return ResponseEntity.ok(new Resultado(true, calculadoraService.subtrair(valor.valor)));
    }

    @PutMapping("/calculadora/multiplicacao")
    public ResponseEntity<Resultado> multiplicar(@RequestBody Valor valor){
        return ResponseEntity.ok(new Resultado(true, calculadoraService.multiplicar(valor.valor)));
    }

    @PutMapping("/calculadora/divisao")
    public ResponseEntity<Resultado> dividir(@RequestBody Valor valor){
        return ResponseEntity.ok(new Resultado(true, calculadoraService.dividir(valor.valor)));
    }
}
