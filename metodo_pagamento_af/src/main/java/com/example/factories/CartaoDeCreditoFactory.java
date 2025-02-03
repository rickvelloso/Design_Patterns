package com.example.factories;

import com.example.metodo_pagamento.CartaoDeCredito;
import com.example.metodo_pagamento.MetodoPagamento;

public class CartaoDeCreditoFactory extends MetodoPagamentoFactory {
    @Override
    public MetodoPagamento criarPagamento() {
        return new CartaoDeCredito();
    }

}
