package com.example.factories;

import com.example.plataforma.Mobile;
import com.example.plataforma.Plataforma;

public class MobileFactory extends PlataformaFactory {
    @Override
    public Plataforma criarPlataforma() {
        return new Mobile();
    }
}
