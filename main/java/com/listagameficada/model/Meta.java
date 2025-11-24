package com.listagameficada.model;

public class Meta {
    private Long id;
    private String titulo;
    private String descricao;
    private String prazo;
    private String status = "PENDENTE";

    // Construtor padrão
    public Meta() {}

    // Construtor
    public Meta(Long id, String titulo, String descricao, String prazo) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getPrazo() { return prazo; }
    public void setPrazo(String prazo) { this.prazo = prazo; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
