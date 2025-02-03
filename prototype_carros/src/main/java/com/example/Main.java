package com.example;

import com.example.models.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carroOriginal = new Carro("Fusca", "Vermelho", 1970, 9999, "Bem usado");

        carroOriginal.imprimir();

        Carro carroClonado = (Carro) carroOriginal.clonar();

        carroClonado = new Carro(carroClonado.getModelo(), "Azul", carroClonado.getAno(), carroClonado.getPreco(), carroClonado.getEstadoDeConservacao());      

        carroClonado.imprimir();
    }
}