package com.example.products;

public class Van implements Transporte {

    @Override
    public void capacidade() {
        System.out.println("Capacidade de 10 toneladas");
    }

    @Override
    public void tempoDeEntrega() {
        System.out.println("Tempo de entrega de 2 horas");
    }

}
