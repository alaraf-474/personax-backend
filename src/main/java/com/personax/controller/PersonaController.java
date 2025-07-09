package com.personax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from PersonaX Controller!";
    }
}