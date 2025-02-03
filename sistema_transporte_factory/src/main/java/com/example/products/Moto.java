package com.example.products;

public class Moto implements Transporte {

    private final String capacidade;
    private final String tempoDeEntrega;

    public Moto(String capacidade, String tempoDeEntrega) {
        this.capacidade = capacidade;
        this.tempoDeEntrega = tempoDeEntrega;
    }

    @Override
    public void capacidade() {
        System.out.println("Capacidade: " + capacidade);
    }

    @Override
    public void tempoDeEntrega() {
        System.out.println("Tempo de entrega: " + tempoDeEntrega);
    }

}
