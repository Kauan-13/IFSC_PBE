package ads.pbe.calculadorarest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    record Erro(boolean sucesso, String descricao){}

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Erro> handleIllegalArgument(IllegalArgumentException ex){
        return new ResponseEntity<>(new Erro(false, ex.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
