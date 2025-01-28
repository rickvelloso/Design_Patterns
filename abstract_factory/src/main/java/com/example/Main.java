package com.example;

import com.example.loja.LojaCentroDaInformatica;
import com.example.models.Produto;
import com.example.venda.Venda;
import com.example.venda.VendaFactory;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        
        produto.setNome("Iphone 15 Pro Max");
        produto.setQuantidade(1);
        produto.setValorUnitario(10000.0);

        VendaFactory factory = new LojaCentroDaInformatica();

        Venda venda = new  Venda(factory);

        venda.realizarVenda(produto);

    }
}