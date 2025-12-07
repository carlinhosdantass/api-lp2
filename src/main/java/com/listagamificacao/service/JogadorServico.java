package com.listagamificacao.service;

import com.listagamificacao.model.Jogador;
import com.listagamificacao.repository.JogadorRepositorio;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JogadorServico {

    private final JogadorRepositorio jogadorRepositorio;

    public JogadorServico(JogadorRepositorio jogadorRepositorio) {
        this.jogadorRepositorio = jogadorRepositorio;
    }

    public Jogador adicionar(Jogador jogador) {
        return jogadorRepositorio.salvar(jogador);
    }

    public Jogador buscarPorId(Long id) {
        return jogadorRepositorio.buscarPorId(id);
    }

    public Collection<Jogador> listar() {
        return jogadorRepositorio.listar();
    }

    public void remover(Long id) {
        jogadorRepositorio.remover(id);
    }
}
