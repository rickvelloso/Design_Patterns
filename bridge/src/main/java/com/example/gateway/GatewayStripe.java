package com.example.gateway;

public class GatewayStripe implements GatewayPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento processado pelo Stripe: " + valor);
    }

}
