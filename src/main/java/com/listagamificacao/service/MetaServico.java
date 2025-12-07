package com.listagamificacao.service;

import com.listagamificacao.model.Meta;
import com.listagamificacao.repository.MetaRepositorio;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MetaServico {

    private final MetaRepositorio metaRepositorio;

    public MetaServico(MetaRepositorio metaRepositorio) {
        this.metaRepositorio = metaRepositorio;
    }

    public Meta adicionar(Meta meta) {
        return metaRepositorio.salvar(meta);
    }

    public Meta buscarPorId(Long id) {
        return metaRepositorio.buscarPorId(id);
    }

    public Collection<Meta> listar() {
        return metaRepositorio.listar();
    }

    public Meta atualizar(Long id, Meta metaAtualizada) {
        Meta metaExistente = metaRepositorio.buscarPorId(id);
        if (metaExistente != null) {
            metaExistente.setTitulo(metaAtualizada.getTitulo());
            metaExistente.setPontos(metaAtualizada.getPontos());
            metaRepositorio.salvar(metaExistente);
        }
        return metaExistente;
    }

    public void remover(Long id) {
        metaRepositorio.remover(id);
    }
}
