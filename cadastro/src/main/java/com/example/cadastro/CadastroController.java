package com.example.cadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {
    @GetMapping("/")
    public String home() {
        return "Minha primeira página Web com Java.";
    }
}
