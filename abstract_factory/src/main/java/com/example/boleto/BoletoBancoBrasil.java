package com.example.boleto;

import com.example.models.Produto;

public class BoletoBancoBrasil implements Boleto{

    @Override
    public void emitir(Produto produto, double imposto) {
        System.out.println("Boleto do Banco do Brasil");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValorUnitario());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor total: " + produto.getValorTotal(imposto));
    }

}
