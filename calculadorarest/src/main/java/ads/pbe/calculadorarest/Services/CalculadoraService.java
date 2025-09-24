package ads.pbe.calculadorarest.Services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    private double acc;

    public CalculadoraService() {
        acc = 0;
    }

    public double getAcc() {
        return acc;
    }

    public double limpar() {
       return acc = 0;
    }

    public double somar(double valor) {
        return acc += valor;
    }

    public double subtrair(double valor) {
        return acc -= valor;
    }

    public double multiplicar(double valor) {
        return acc *= valor;
    }

    public double dividir(double valor) {
        if (valor == 0){
            throw new IllegalArgumentException("Divisão por 0");
        }

        return acc /= valor;
    }
}
