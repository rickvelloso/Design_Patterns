package com.example.plataforma;

import com.example.metodo_pagamento.MetodoPagamento;

public class Web implements Plataforma{

    @Override
    public void processarPagamento(MetodoPagamento metodoPagamento) {
        System.out.println("Pagamento processado pelo mobile" + metodoPagamento.getClass().getSimpleName());
    }
}
