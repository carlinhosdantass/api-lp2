package com.listagamificacao.controller;

import com.listagamificacao.model.Meta;
import com.listagamificacao.service.MetaServico;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/metas")
public class MetaControlador {

    private final MetaServico metaServico;

    public MetaControlador(MetaServico metaServico) {
        this.metaServico = metaServico;
    }

    @PostMapping
    public Meta adicionar(@RequestBody Meta meta) {
        return metaServico.adicionar(meta);
    }

    @GetMapping("/{id}")
    public Meta buscarPorId(@PathVariable Long id) {
        return metaServico.buscarPorId(id);
    }

    @GetMapping
    public Collection<Meta> listar() {
        return metaServico.listar();
    }

    @PutMapping("/{id}")
    public Meta atualizar(@PathVariable Long id, @RequestBody Meta meta) {
        return metaServico.atualizar(id, meta);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        metaServico.remover(id);
    }
}
