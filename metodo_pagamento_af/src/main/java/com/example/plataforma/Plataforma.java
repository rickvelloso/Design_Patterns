package com.example.plataforma;

import com.example.metodo_pagamento.MetodoPagamento;

public interface Plataforma {
    void processarPagamento(MetodoPagamento metodoPagamento);
}
