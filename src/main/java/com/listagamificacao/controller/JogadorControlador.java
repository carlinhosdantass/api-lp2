package com.listagamificacao.controller;

import com.listagamificacao.model.Jogador;
import com.listagamificacao.service.JogadorServico;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/jogadores")
public class JogadorControlador {

    private final JogadorServico jogadorServico;

    public JogadorControlador(JogadorServico jogadorServico) {
        this.jogadorServico = jogadorServico;
    }

    @PostMapping
    public Jogador adicionar(@RequestBody Jogador jogador) {
        return jogadorServico.adicionar(jogador);
    }

    @GetMapping("/{id}")
    public Jogador buscarPorId(@PathVariable Long id) {
        return jogadorServico.buscarPorId(id);
    }

    @GetMapping
    public Collection<Jogador> listar() {
        return jogadorServico.listar();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        jogadorServico.remover(id);
    }
}
