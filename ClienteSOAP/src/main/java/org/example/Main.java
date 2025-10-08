package org.example;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // instancia o acesso ao web service
        NumberConversion service = new NumberConversion();

        // instancia o serviço de conversão de números
        NumberConversionSoapType numberConversionSoapType = service.getNumberConversionSoap();

        // faz uma chamada remota ao procedimento de conversão de número
        String numberInWords = numberConversionSoapType.numberToDollars(BigDecimal.valueOf(23500000));

        // mostra na tela o resultado
        System.out.println(numberInWords);
    }
}