package org.example;

import com.daehosting.webservices.isbn.ISBNService;
import com.daehosting.webservices.isbn.ISBNServiceSoapType;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ISBNService service = new ISBNService();

        ISBNServiceSoapType isbnServiceSoapType = service.getISBNServiceSoap();

        boolean response = isbnServiceSoapType.isValidISBN10("8051009834");

        System.out.println(response);
    }
}