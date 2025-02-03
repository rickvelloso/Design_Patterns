package com.example.adapters;

import com.example.sistemas_de_pagamentos.SistemaPagamentoBancario;
import com.example.target.Pagamento;

public class SistemaPagamentoBancarioAdapter implements Pagamento {
    private SistemaPagamentoBancario sistemaPagamentoBancario;

    public SistemaPagamentoBancarioAdapter(SistemaPagamentoBancario sistemaPagamentoBancario) {
        this.sistemaPagamentoBancario = sistemaPagamentoBancario;
    }

    @Override
    public void processarPagamento(double valor) {
        sistemaPagamentoBancario.realizarPagamentoBancario(valor);
    }

}
