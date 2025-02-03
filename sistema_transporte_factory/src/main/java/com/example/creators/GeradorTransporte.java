package com.example.creators;

import com.example.products.Transporte;

public abstract class GeradorTransporte {

    public abstract Transporte factoryMethod();

    public void enviarTransporte() {
        Transporte transporte = factoryMethod();
        transporte.capacidade();
        transporte.tempoDeEntrega();
    }
}
