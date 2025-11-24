package com.listagameficada.repository;

import com.listagameficada.model.Meta;
import java.util.*;

public class MetaRepository {
    private Map<Long, Meta> metas = new HashMap<>();
    private Long id = 1L;

    public Meta salvar(Meta meta) {
        meta.setId(id++);
        metas.put(meta.getId(), meta);
        return meta;
    }

    public Meta atualizar(Long id, Meta meta) {
        metas.put(id, meta);
        return meta;
    }

    public Meta buscar(Long id) {
        return metas.get(id);
    }

    public List<Meta> listar() {
        return new ArrayList<>(metas.values());
    }
}
