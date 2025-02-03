package com.example.factories;

import com.example.plataforma.Plataforma;
import com.example.plataforma.Web;

public class WebFactory extends PlataformaFactory {
    @Override
    public Plataforma criarPlataforma() {
        return new Web();
    }
}
