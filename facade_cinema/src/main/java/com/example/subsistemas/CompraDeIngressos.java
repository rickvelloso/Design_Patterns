package com.example.subsistemas;

public class CompraDeIngressos {
    public void comprar(String filme, int quantidade) {
        System.out.println("Ingressos para o filme '" + filme + "' comprados. Quantidade: " + quantidade);
    }

    public void cancelar() {
        System.out.println("Ingressos cancelados");
    }
}
