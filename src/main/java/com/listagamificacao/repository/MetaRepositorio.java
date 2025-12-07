package com.listagamificacao.repository;

import com.listagamificacao.model.Meta;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MetaRepositorio {

    private final Map<Long, Meta> tabela = new HashMap<>();
    private final AtomicLong contadorId = new AtomicLong(0);

    public Meta salvar(Meta meta) {
        if (meta.getId() == null) {
            meta.setId(contadorId.incrementAndGet());
        }
        tabela.put(meta.getId(), meta);
        return meta;
    }

    public Meta buscarPorId(Long id) {
        return tabela.get(id);
    }

    public Collection<Meta> listar() {
        return tabela.values();
    }

    public void remover(Long id) {
        tabela.remove(id);
    }
}
