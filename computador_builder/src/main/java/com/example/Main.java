package com.example;

import com.example.builder.ComputadorBuilder;
import com.example.builder.ComputadorConcreteBuilder;
import com.example.director.Director;
import com.example.model.Computador;

public class Main {
    public static void main(String[] args) {
        ComputadorBuilder computadorBuilder = new ComputadorConcreteBuilder();
        Director director = new Director(computadorBuilder);

        director.construirComputador("Intel Core i7", "16GB", "1TB", "NVIDIA GeForce RTX 2080");
        Computador computador = director.getComputador();

        System.out.println(computador);
    }
}