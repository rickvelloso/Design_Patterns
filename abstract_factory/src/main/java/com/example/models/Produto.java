package com.example.models;

public class Produto {
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public double getValorTotal(double imposto) {
        double valorTotal = valorUnitario + imposto;
        return valorTotal * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
