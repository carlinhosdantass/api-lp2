package com.listagamificacao.repositorio;

import com.listagamificacao.modelo.Conquista;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConquistaRepositorio {

    private List<Conquista> conquistas = new ArrayList<>();

    public void adicionar(Conquista conquista) {
        conquistas.add(conquista);
    }

    public List<Conquista> listar() {
        return conquistas;
    }
}
