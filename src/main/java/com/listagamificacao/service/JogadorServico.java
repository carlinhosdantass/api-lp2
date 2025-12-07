package com.listagamificacao.servico;

import com.listagamificacao.modelo.Jogador;
import com.listagamificacao.repositorio.JogadorRepositorio;
import org.springframework.stereotype.Service;

@Service
public class JogadorServico {

    private final JogadorRepositorio jogadorRepositorio;

    public JogadorServico(JogadorRepositorio jogadorRepositorio) {
        this.jogadorRepositorio = jogadorRepositorio;
    }

    public Jogador dados() {
        return jogadorRepositorio.getJogador();
    }
}
