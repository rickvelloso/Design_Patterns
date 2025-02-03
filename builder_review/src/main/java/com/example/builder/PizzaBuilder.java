package com.example.builder;

import com.example.produto.Pizza;

public interface PizzaBuilder {
    void buildMassa(String tipoMassa);
    void buildQueijo(String tipoQueijo);
    void buildCobertura(String tipoCobertura);
    Pizza getPizza();
}

