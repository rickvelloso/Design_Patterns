package com.example.metodo_pagamento;

import com.example.plataforma.Plataforma;

public class CartaoDeCredito implements MetodoPagamento {

    @Override
    public void pagar(Plataforma plataforma) {
        plataforma.processarPagamento(this);
    }

}
