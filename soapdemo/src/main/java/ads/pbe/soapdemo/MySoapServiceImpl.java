package ads.pbe.soapdemo;

import org.springframework.stereotype.Service;

@Service
public class MySoapServiceImpl implements MySoapService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " from CXF SOAP!";
    }

    @Override
    public Double soma(Double n1, Double n2) {
        return n1 + n2;
    }

    @Override
    public Double subtracao(Double n1, Double n2) {
        return n1 - n2;
    }

    @Override
    public Double multiplicacao(Double n1, Double n2) {
        return n1 * n2;
    }

    @Override
    public Double divisao(Double n1, Double n2) {
        return n1 / n2;
    }
}