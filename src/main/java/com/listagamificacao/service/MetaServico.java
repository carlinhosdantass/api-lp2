package com.listagamificacao.servico;

import com.listagamificacao.modelo.Meta;
import com.listagamificacao.repositorio.MetaRepositorio;
import com.listagamificacao.repositorio.JogadorRepositorio;
import org.springframework.stereotype.Service;

@Service
public class MetaServico {

    private final MetaRepositorio metaRepositorio;
    private final JogadorRepositorio jogadorRepositorio;
    private final ConquistaServico conquistaServico;

    public MetaServico(MetaRepositorio metaRepositorio, JogadorRepositorio jogadorRepositorio,
                       ConquistaServico conquistaServico) {
        this.metaRepositorio = metaRepositorio;
        this.jogadorRepositorio = jogadorRepositorio;
        this.conquistaServico = conquistaServico;
    }

    public Meta criar(String titulo, String descricao, String prazo) {
        return metaRepositorio.criar(titulo, descricao, prazo);
    }

    public Iterable<Meta> listar() {
        return metaRepositorio.listar().values();
    }

    public String concluir(Long id) {
        Meta meta = metaRepositorio.buscar(id);

        if (meta == null) {
            return "Meta não encontrada.";
        }

        meta.setStatus("concluída");

        // Pontuação e histórico
        jogadorRepositorio.getJogador().adicionarPontos(20);
        jogadorRepositorio.getJogador().adicionarAoHistorico(meta);

        // Checar conquistas
        conquistaServico.verificarDesbloqueio();

        return "Meta concluída!";
    }
}
