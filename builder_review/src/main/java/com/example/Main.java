package com.example;

import com.example.builder.ConcretePizzaBuilder;
import com.example.builder.PizzaBuilder;
import com.example.director.PizzaDirector;
import com.example.produto.Pizza;

public class Main {
    public static void main(String[] args) {
        // Passando o ConcretePizzaBuilder para o Diretor
        PizzaBuilder pizzaBuilder = new ConcretePizzaBuilder();

        // Criando o Diretor
        PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);

        // Construindo a pizza com os ingredientes
        pizzaDirector.construirPizza("calabresa", "massa fina", "queijo mussarela");

        // Obtendo a pizza pronta
        Pizza pizza = pizzaDirector.getPizza();

        // Exibindo a pizza final
        System.out.println(pizza);
    }
}