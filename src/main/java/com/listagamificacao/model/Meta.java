package com.listagamificacao.modelo;

public class Meta {

    private Long id;
    private String titulo;
    private String descricao;
    private String prazo;

    // pendente, andamento, concluida
    private String status;

    public Meta(Long id, String titulo, String descricao, String prazo) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.status = "pendente";
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public String getPrazo() { return prazo; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
