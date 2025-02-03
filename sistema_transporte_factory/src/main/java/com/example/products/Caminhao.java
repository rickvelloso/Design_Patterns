package com.example.products;

public class Caminhao implements Transporte {

    @Override
    public void capacidade() {
        System.out.println("Capacidade de 20 toneladas");
    }

    @Override
    public void tempoDeEntrega() {
        System.out.println("Entrega em 2 dias");
    }

}
