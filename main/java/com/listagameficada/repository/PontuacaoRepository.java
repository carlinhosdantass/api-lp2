package com.listagameficada.repository;

import com.listagameficada.model.Usuario;

public class PontuacaoRepository {
    private Usuario usuario = new Usuario();

    public Usuario getUsuario() { return usuario; }

    public void atualizar(Usuario usuario) {
        this.usuario = usuario;
    }
}
