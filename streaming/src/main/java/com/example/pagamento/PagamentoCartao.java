package com.example.pagamento;

import com.example.gateway.GatewayPagamento;

public class PagamentoCartao extends Pagamento{
    public PagamentoCartao(GatewayPagamento gatewayPagamento) {
        super(gatewayPagamento);
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito: " + valor);
        gatewayPagamento.processarPagamento(valor);
    }
}
