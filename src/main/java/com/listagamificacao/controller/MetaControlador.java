package com.listagamificacao.controlador;

import com.listagamificacao.modelo.Meta;
import com.listagamificacao.servico.MetaServico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metas")
public class MetaControlador {

    private final MetaServico servico;

    public MetaControlador(MetaServico s){ servico=s; }

    @PostMapping
    public Meta criar(@RequestParam String titulo,@RequestParam String descricao,@RequestParam String prazo){ return servico.criar(titulo,descricao,prazo); }

    @GetMapping
    public Iterable<Meta> listar(){ return servico.listar(); }

    @PostMapping("/{id}/concluir")
    public String concluir(@PathVariable Long id){ return servico.concluir(id); }
}
