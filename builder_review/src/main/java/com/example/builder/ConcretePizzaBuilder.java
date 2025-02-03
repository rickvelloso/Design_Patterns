package com.example.builder;

import com.example.produto.Pizza;

public class ConcretePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public ConcretePizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildMassa(String tipoMassa) {
        pizza.setMassa(tipoMassa);
    }

    @Override
    public void buildQueijo(String tipoQueijo) {
        pizza.setQueijo(tipoQueijo);
    }

    @Override
    public void buildCobertura(String tipoCobertura) {
        pizza.setCobertura(tipoCobertura);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

}
