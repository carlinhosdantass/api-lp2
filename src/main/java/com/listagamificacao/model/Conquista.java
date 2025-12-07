package com.listagamificacao.model;

public class Conquista {
    private Long id;
    private String descricao;
    private int pontos;

    public Conquista() {}

    public Conquista(String descricao, int pontos) {
        this.descricao = descricao;
        this.pontos = pontos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
