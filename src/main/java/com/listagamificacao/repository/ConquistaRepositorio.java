package com.listagamificacao.repository;

import com.listagamificacao.model.Conquista;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ConquistaRepositorio {

    private final Map<Long, Conquista> tabela = new HashMap<>();
    private final AtomicLong contadorId = new AtomicLong(0);

    public Conquista salvar(Conquista conquista) {
        if (conquista.getId() == null) {
            conquista.setId(contadorId.incrementAndGet());
        }
        tabela.put(conquista.getId(), conquista);
        return conquista;
    }

    public Conquista buscarPorId(Long id) {
        return tabela.get(id);
    }

    public Collection<Conquista> listar() {
        return tabela.values();
    }

    public void remover(Long id) {
        tabela.remove(id);
    }
}
