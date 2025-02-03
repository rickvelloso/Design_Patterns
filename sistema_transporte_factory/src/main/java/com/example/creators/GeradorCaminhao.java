package com.example.creators;

import com.example.products.Caminhao;
import com.example.products.Transporte;

public class GeradorCaminhao extends GeradorTransporte {
    @Override
    public Transporte factoryMethod() {
        return new Caminhao();
    }

}
