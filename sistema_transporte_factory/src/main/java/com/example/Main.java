package com.example;

import com.example.creators.GeradorCaminhao;
import com.example.creators.GeradorMoto;
import com.example.creators.GeradorTransporte;
import com.example.creators.GeradorVan;

public class Main {
    public static void main(String[] args) {
        GeradorTransporte geradorCaminhao = new GeradorCaminhao();
        geradorCaminhao.enviarTransporte();
        
        GeradorTransporte geradorMoto = new GeradorMoto();
        geradorMoto.enviarTransporte();

        GeradorTransporte geradorVan = new GeradorVan();
        geradorVan.enviarTransporte();
    }
}