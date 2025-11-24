package com.listagameficada.repository;

import com.listagameficada.model.Conquista;
import java.util.*;

public class ConquistaRepository {
    private Map<Long, Conquista> conquistas = new HashMap<>();

    public void adicionar(Conquista c) {
        conquistas.put(c.getId(), c);
    }

    public List<Conquista> listar() {
        return new ArrayList<>(conquistas.values());
    }
}
