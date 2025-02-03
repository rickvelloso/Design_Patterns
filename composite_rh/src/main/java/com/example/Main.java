package com.example;

import com.example.composite.Gerente;
import com.example.leaf.Dev;

public class Main {
    public static void main(String[] args) {
        // Composite
        Gerente Alice = new Gerente("Alice");
        Gerente Claudio = new Gerente("Claudio");
        Dev Bob = new Dev("Bob");
        Dev Carol = new Dev("Carol");

        Alice.adicionar(Claudio);
        Alice.adicionar(Bob);
        Claudio.adicionar(Carol);

        Alice.exibir("");

    }
}