package com.example.decorator;

import com.example.produtos.Produto;

public class Estampa extends ProdutoDecorator {
    public Estampa(Produto produto) {
        super(produto);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 5.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", estampa";
    }
    
}
