package com.listagamificacao.controlador;

import com.listagamificacao.modelo.Conquista;
import com.listagamificacao.servico.ConquistaServico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conquistas")
public class ConquistaControlador {

    private final ConquistaServico conquistaServico;

    public ConquistaControlador(ConquistaServico conquistaServico) {
        this.conquistaServico = conquistaServico;
    }

    @GetMapping
    public Iterable<Conquista> listar() {
        return conquistaServico.listar();
    }
}
