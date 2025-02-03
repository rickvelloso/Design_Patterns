package com.example.gateway;

public class GatewayPayPal implements GatewayPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento processado pelo PayPal: " + valor);
    }

}
