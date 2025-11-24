package com.listagameficada.repository;

import com.listagameficada.model.HistoricoItem;
import java.util.*;

public class HistoricoRepository {
    private List<HistoricoItem> historico = new ArrayList<>();

    public void adicionar(HistoricoItem item) {
        historico.add(item);
    }

    public List<HistoricoItem> listar() {
        return historico;
    }
}
