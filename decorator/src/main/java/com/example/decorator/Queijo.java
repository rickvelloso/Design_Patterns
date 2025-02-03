package com.example.decorator;

import com.example.pizza.Pizza;

public class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 5.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", queijo";
    }
    
}
