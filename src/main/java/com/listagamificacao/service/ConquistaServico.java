package com.listagamificacao.service;

import com.listagamificacao.model.Conquista;
import com.listagamificacao.repository.ConquistaRepositorio;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ConquistaServico {

    private final ConquistaRepositorio conquistaRepositorio;

    public ConquistaServico(ConquistaRepositorio conquistaRepositorio) {
        this.conquistaRepositorio = conquistaRepositorio;
    }

    public Conquista adicionar(Conquista conquista) {
        return conquistaRepositorio.salvar(conquista);
    }

    public Conquista buscarPorId(Long id) {
        return conquistaRepositorio.buscarPorId(id);
    }

    public Collection<Conquista> listar() {
        return conquistaRepositorio.listar();
    }

    public void remover(Long id) {
        conquistaRepositorio.remover(id);
    }
}
