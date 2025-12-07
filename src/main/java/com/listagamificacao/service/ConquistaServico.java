package com.listagamificacao.servico;

import com.listagamificacao.modelo.Conquista;
import com.listagamificacao.modelo.Jogador;
import com.listagamificacao.repositorio.ConquistaRepositorio;
import com.listagamificacao.repositorio.JogadorRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ConquistaServico {

    private final ConquistaRepositorio conquistaRepositorio;
    private final JogadorRepositorio jogadorRepositorio;

    public ConquistaServico(ConquistaRepositorio conquistaRepositorio,
                            JogadorRepositorio jogadorRepositorio) {
        this.conquistaRepositorio = conquistaRepositorio;
        this.jogadorRepositorio = jogadorRepositorio;
    }

    public void verificarDesbloqueio() {
        Jogador j = jogadorRepositorio.getJogador();

        // conquista simples: 5 metas concluídas
        if (j.getHistorico().size() == 5) {
            conquistaRepositorio.adicionar(
                new Conquista(1L, "Começo Brilhante", "Você concluiu 5 metas!")
            );
        }
    }

    public Iterable<Conquista> listar() {
        return conquistaRepositorio.listar();
    }
}
