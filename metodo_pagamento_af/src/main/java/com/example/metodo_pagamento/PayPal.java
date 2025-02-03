package com.example.metodo_pagamento;

import com.example.plataforma.Plataforma;

public class PayPal implements MetodoPagamento {

    @Override
    public void pagar(Plataforma plataforma) { 
        plataforma.processarPagamento(this);
    }

}
