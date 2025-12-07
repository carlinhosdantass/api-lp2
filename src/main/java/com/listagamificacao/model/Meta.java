package com.listagamificacao.model;

public class Meta {
    private Long id;
    private String titulo;
    private int pontos;

    public Meta() {}

    public Meta(String titulo, int pontos) {
        this.titulo = titulo;
        this.pontos = pontos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
