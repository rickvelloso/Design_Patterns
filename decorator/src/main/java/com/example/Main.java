package com.example;

import com.example.decorator.Bacon;
import com.example.decorator.Queijo;
import com.example.pizza.Pizza;
import com.example.pizza.PizzaSimples;

public class Main {
    public static void main(String[] args) {
        // Decorator

        Pizza pizza = new PizzaSimples();

        System.out.println("Pizza simples:");

        System.out.println("Descrição: " + pizza.getDescricao());

        System.out.println("Preço: " + pizza.getPreco());

        Pizza pizzaComQueijo = new Queijo(pizza);
        System.out.println("\nPizza com queijo:" + "\nDescrição: " + pizzaComQueijo.getDescricao() + "\nPreço: " + pizzaComQueijo.getPreco());

        Pizza pizzaComBaconEQueijo = new Bacon(pizzaComQueijo);
        System.out.println("\nPizza com bacon e queijo:" + "\nDescrição: " + pizzaComBaconEQueijo.getDescricao() + "\nPreço: " + pizzaComBaconEQueijo.getPreco());
        
    }
}