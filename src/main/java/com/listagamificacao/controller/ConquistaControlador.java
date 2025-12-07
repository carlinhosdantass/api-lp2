package com.listagamificacao.controller;

import com.listagamificacao.model.Conquista;
import com.listagamificacao.service.ConquistaServico;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/conquistas")
public class ConquistaControlador {

    private final ConquistaServico conquistaServico;

    public ConquistaControlador(ConquistaServico conquistaServico) {
        this.conquistaServico = conquistaServico;
    }

    @PostMapping
    public Conquista adicionar(@RequestBody Conquista conquista) {
        return conquistaServico.adicionar(conquista);
    }

    @GetMapping("/{id}")
    public Conquista buscarPorId(@PathVariable Long id) {
        return conquistaServico.buscarPorId(id);
    }

    @GetMapping
    public Collection<Conquista> listar() {
        return conquistaServico.listar();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        conquistaServico.remover(id);
    }
}
