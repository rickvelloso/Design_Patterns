package com.example.plataforma;

import com.example.metodo_pagamento.MetodoPagamento;

public class Mobile implements Plataforma {
    
    @Override
    public void processarPagamento(MetodoPagamento metodoPagamento) {
        System.out.println("Pagamento processado pelo mobile" + metodoPagamento.getClass().getSimpleName());
    }
    
}
