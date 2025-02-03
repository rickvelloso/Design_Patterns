package com.example;

import com.example.gateway.GatewayPagamento;
import com.example.gateway.GatewayPayPal;
import com.example.gateway.GatewayStripe;
import com.example.pagamento.Pagamento;
import com.example.pagamento.PagamentoCartao;
import com.example.pagamento.PagamentoPix;

public class Main {
    public static void main(String[] args) {
        // Bridge

        GatewayPagamento payPal = new GatewayPayPal();
        Pagamento pagamentoPayPal = new PagamentoCartao(payPal);
        pagamentoPayPal.realizarPagamento(100.0);

        GatewayPagamento stripe = new GatewayStripe();
        Pagamento pagamentoStripe = new PagamentoPix(stripe);
        pagamentoStripe.realizarPagamento(200.0);
    }
}