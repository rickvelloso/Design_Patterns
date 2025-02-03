package com.example.decorator;

import com.example.produtos.Produto;

public abstract class ProdutoDecorator implements Produto {
    protected Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    @Override
    public double getPreco() {
        return produto.getPreco();
    }

    @Override
    public String getDescricao() {
        return produto.getDescricao();
    }

}
