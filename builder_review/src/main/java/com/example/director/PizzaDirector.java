package com.example.director;

import com.example.builder.PizzaBuilder;
import com.example.produto.Pizza;

public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void construirPizza(String tipoCobertura, String tipoMassa, String tipoQueijo) {
        pizzaBuilder.buildCobertura(tipoCobertura);
        pizzaBuilder.buildMassa(tipoMassa);
        pizzaBuilder.buildQueijo(tipoQueijo);
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
