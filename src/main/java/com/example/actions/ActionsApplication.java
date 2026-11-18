package com.example.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActionsApplication.class, args);
    }

    @RequestMapping("/hello")
    String helloWorld() {
        return "Hola Mundo!";
    }

}
