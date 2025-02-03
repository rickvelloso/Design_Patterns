package com.example.adapters;

import com.example.sistemas_de_pagamentos.SistemaPagamentoDigital;
import com.example.target.Pagamento;

public class SistemaPagamentoDigitalAdapter implements Pagamento {
    private SistemaPagamentoDigital sistemaPagamentoDigital;

    public SistemaPagamentoDigitalAdapter(SistemaPagamentoDigital sistemaPagamentoDigital) {
        this.sistemaPagamentoDigital = sistemaPagamentoDigital;
    }

    @Override
    public void processarPagamento(double valor) {
        sistemaPagamentoDigital.realizarPagamentoDigital(valor);
    }

}
