package com.listagamificacao.repositorio;

import com.listagamificacao.modelo.Jogador;
import org.springframework.stereotype.Repository;

@Repository
public class JogadorRepositorio {
    private Jogador jogador=new Jogador();
    public Jogador getJogador(){ return jogador; }
}
