package com.example;

import com.example.decorator.Estampa;
import com.example.produtos.Produto;
import com.example.produtos.ProdutoSimples;

public class Main {
    public static void main(String[] args) {
        // Decorator

        Produto produto = new ProdutoSimples(100.0, "Camiseta");
        System.out.println(produto.getDescricao() + ": " + produto.getPreco());
        Estampa estampa = new Estampa(produto);
        System.out.println(estampa.getDescricao() + ": " + estampa.getPreco());
    }   
}