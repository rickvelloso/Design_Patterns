package com.example.pizza;

public class PizzaSimples implements Pizza {
    @Override
    public double getPreco() {
        return 30.0;
    }
    @Override
    public String getDescricao() {
        return "Pizza simples";
    }

}
