package com.example.facade;

import com.example.subsistemas.CompraDeIngressos;
import com.example.subsistemas.ConfirmacaoDePagamento;
import com.example.subsistemas.EnvioDeNotificacao;
import com.example.subsistemas.GerenciamentoDeFilmes;

public class CinemaFacade {
    private GerenciamentoDeFilmes gerenciamentoDeFilmes;
    private CompraDeIngressos compraDeIngressos;
    private ConfirmacaoDePagamento confirmacaoDePagamento;
    private EnvioDeNotificacao envioDeNotificacao;

    public CinemaFacade() {
        this.gerenciamentoDeFilmes = new GerenciamentoDeFilmes();
        this.compraDeIngressos = new CompraDeIngressos();
        this.confirmacaoDePagamento = new ConfirmacaoDePagamento();
        this.envioDeNotificacao = new EnvioDeNotificacao();
    }

    public void comprarIngresso(String filme, int quantidade) {
        this.gerenciamentoDeFilmes.exibirFilmesEmCartaz();
        this.compraDeIngressos.comprar(filme, quantidade);
        this.confirmacaoDePagamento.confirmar();
        this.envioDeNotificacao.enviar();
    }

}
