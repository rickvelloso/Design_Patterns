package com.example.pagamento;

import com.example.gateway.GatewayPagamento;

public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(GatewayPagamento gatewayPagamento) {
        super(gatewayPagamento);
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito no valor de R$" + valor);
        gatewayPagamento.processarPagamento(valor);
    }

}
