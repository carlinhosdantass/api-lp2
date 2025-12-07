package com.listagamificacao.modelo;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int pontos = 0;
    private int nivel = 1;

    private List<Meta> historico = new ArrayList<>();

    public int getPontos() { return pontos; }
    public int getNivel() { return nivel; }
    public List<Meta> getHistorico() { return historico; }

    // Adiciona pontos e recalcula nível
    public void adicionarPontos(int valor) {
        this.pontos += valor;
        this.nivel = (pontos / 100) + 1; // simples
    }

    public void adicionarAoHistorico(Meta meta) {
        historico.add(meta);
    }
}
