package com.example.factories;

import com.example.metodo_pagamento.MetodoPagamento;
import com.example.metodo_pagamento.PayPal;

public class PayPalFactory extends MetodoPagamentoFactory {
    @Override
    public MetodoPagamento criarPagamento() {
        return new PayPal();
    }
}
