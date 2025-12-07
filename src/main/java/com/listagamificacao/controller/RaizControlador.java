package com.listagamificacao.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaizControlador {

    @GetMapping("/")
    public String raiz() {
        return "API rodando!";
    }
}