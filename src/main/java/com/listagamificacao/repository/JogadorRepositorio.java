package com.listagamificacao.repository;

import com.listagamificacao.model.Jogador;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class JogadorRepositorio {

    private final Map<Long, Jogador> tabela = new HashMap<>();
    private final AtomicLong contadorId = new AtomicLong(0);

    public Jogador salvar(Jogador jogador) {
        if (jogador.getId() == null) {
            jogador.setId(contadorId.incrementAndGet());
        }
        tabela.put(jogador.getId(), jogador);
        return jogador;
    }

    public Jogador buscarPorId(Long id) {
        return tabela.get(id);
    }

    public Collection<Jogador> listar() {
        return tabela.values();
    }

    public void remover(Long id) {
        tabela.remove(id);
    }
}
