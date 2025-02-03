package com.example.decorator;

import com.example.pizza.Pizza;

public class Bacon extends PizzaDecorator {
    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 5.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", bacon";
    }

}
