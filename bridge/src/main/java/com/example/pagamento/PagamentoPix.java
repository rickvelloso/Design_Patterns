package com.example.pagamento;

import com.example.gateway.GatewayPagamento;

public class PagamentoPix extends Pagamento {
    public PagamentoPix(GatewayPagamento gatewayPagamento) {
        super(gatewayPagamento);
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento PIX no valor de R$" + valor);
        gatewayPagamento.processarPagamento(valor);
    }       

}
