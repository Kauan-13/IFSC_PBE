package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DemoApplication {

    record Mensagem(String mensagem, int count){}

    private int count = 0;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @GetMapping("/hello")
    public String hello() {
        count++;
        return "Hello World! " + count;
    }

    @GetMapping("/msg")
    public Mensagem msg() {
        count++;
        return new Mensagem("Olá mundo!", count);
    }

}
