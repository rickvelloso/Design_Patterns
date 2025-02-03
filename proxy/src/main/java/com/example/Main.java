package com.example;

import com.example.proxy.ProxyImagem;
import com.example.subject.Imagem;

public class Main {
    public static void main(String[] args) {
        // Proxy

        Imagem imagem = new ProxyImagem("foto.jpg");
        imagem.exibir();
        
    }
}