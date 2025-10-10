package ads.pbe.soapdemo;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC) // Or SOAPBinding.Style.DOCUMENT
public interface MySoapService {

    @WebMethod
    String sayHello(String name);

    @WebMethod
    Double soma(Double n1, Double n2);

    @WebMethod
    Double subtracao(Double n1, Double n2);

    @WebMethod
    Double multiplicacao(Double n1, Double n2);

    @WebMethod
    Double divisao(Double n1, Double n2);
}