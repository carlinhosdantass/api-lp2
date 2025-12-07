package com.listagamificacao.controlador;

import com.listagamificacao.modelo.Jogador;
import com.listagamificacao.servico.JogadorServico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogador")
public class JogadorControlador {

    private final JogadorServico servico;

    public JogadorControlador(JogadorServico s){ servico=s; }

    @GetMapping
    public Jogador dados(){ return servico.dados(); }
}
