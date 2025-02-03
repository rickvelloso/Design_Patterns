package com.example.decorator;

import com.example.pizza.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPreco() {
        return pizza.getPreco();
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }
    

}
