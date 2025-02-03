package com.example.pagamento;

import com.example.gateway.GatewayPagamento;

public abstract class Pagamento {
    GatewayPagamento gatewayPagamento;

    public Pagamento(GatewayPagamento gatewayPagamento) {
        this.gatewayPagamento = gatewayPagamento;
    }

    public abstract void realizarPagamento(double valor);
}
