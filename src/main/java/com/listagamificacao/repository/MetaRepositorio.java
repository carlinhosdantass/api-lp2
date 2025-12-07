package com.listagamificacao.repositorio;

import com.listagamificacao.modelo.Meta;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MetaRepositorio {

    private Map<Long, Meta> banco = new HashMap<>();
    private long idAtual = 1;

    public Meta salvar(Meta meta) {
        banco.put(meta.getId(), meta);
        return meta;
    }

    public Meta criar(String titulo, String descricao, String prazo) {
        Meta meta = new Meta(idAtual++, titulo, descricao, prazo);
        banco.put(meta.getId(), meta);
        return meta;
    }

    public Map<Long, Meta> listar() {
        return banco;
    }

    public Meta buscar(Long id) {
        return banco.get(id);
    }
}
