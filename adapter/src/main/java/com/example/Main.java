package com.example;

import com.example.adapters.SistemaPagamentoBancarioAdapter;
import com.example.sistemas_de_pagamentos.SistemaPagamentoBancario;
import com.example.target.Pagamento;

public class Main {
    public static void main(String[] args) {
        SistemaPagamentoBancario sistemaPagamentoBancario = new SistemaPagamentoBancario();
        Pagamento sistemaPagamentoBancarioAdapter = new SistemaPagamentoBancarioAdapter(sistemaPagamentoBancario);
        sistemaPagamentoBancarioAdapter.processarPagamento(100.0);
        System.out.println("Pagamento bancário realizado com sucesso!");
    }
}