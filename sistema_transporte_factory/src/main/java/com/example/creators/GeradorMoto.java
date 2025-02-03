package com.example.creators;

import com.example.products.Moto;
import com.example.products.Transporte;

public class GeradorMoto extends GeradorTransporte {
    @Override
    public Transporte factoryMethod() {
        return new Moto("15 kg", "1 dia");
    }
}
