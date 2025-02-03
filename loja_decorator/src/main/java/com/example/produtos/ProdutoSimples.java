package com.example.produtos;

public class ProdutoSimples implements Produto {
    private double preco;
    private String descricao;

    public ProdutoSimples(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
