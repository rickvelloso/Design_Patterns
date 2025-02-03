package com.example;

import com.example.composite.Pasta;
import com.example.leaf.Arquivo;

public class Main {
    public static void main(String[] args) {
        // Composite
        Pasta pasta = new Pasta("Pasta");
        Arquivo arquivo1 = new Arquivo("Arquivo 1");
        Arquivo arquivo2 = new Arquivo("Arquivo 2");
        Arquivo arquivo3 = new Arquivo("Arquivo 3");
        pasta.adicionar(arquivo1);
        pasta.adicionar(arquivo2);
        pasta.adicionar(arquivo3);
        pasta.exibir();

        pasta.remover(arquivo2);
        pasta.exibir();
    }
}