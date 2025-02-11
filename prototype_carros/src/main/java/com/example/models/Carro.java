package com.example.models;
import com.example.prototype.CarroPrototype;

public class Carro implements CarroPrototype {

    private String modelo;
    private String cor;
    private int ano;
    private double preco;
    private String estadoDeConservacao;

    public Carro(String modelo, String cor, int ano, double preco, String estadoDeConservacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.estadoDeConservacao = estadoDeConservacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public String getEstadoDeConservacao() {
        return estadoDeConservacao;
    }

    @Override
    public CarroPrototype clonar() {
        return new Carro(modelo, cor, ano, preco, estadoDeConservacao);
    }

    public void alterarCor(String cor) {
        this.cor = cor;
    }

    public void alterarPreco(double preco) {
        this.preco = preco;
    }

    public void alterarEstadoDeConservacao(String estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }

    public void alterarAno(int ano) {
        this.ano = ano;
    }

    public void alterarModelo(String modelo) {
        this.modelo = modelo;
    }


    public void imprimir() {
        System.out.println("Imprimindo carro: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
        System.out.println("Estado de conservação: " + estadoDeConservacao);
    }

}
