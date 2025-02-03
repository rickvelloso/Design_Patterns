package com.example.creators;

import com.example.products.Transporte;
import com.example.products.Van;

public class GeradorVan extends GeradorTransporte {
    @Override
    public Transporte factoryMethod() {
        return new Van();
    }

}
