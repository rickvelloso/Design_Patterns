package com.example.builder;

import com.example.model.Computador;

public interface ComputadorBuilder {
    void buildProcessador(String processador);
    void buildMemoria(String memoria);
    void buildArmazenamento(String armazenamento);
    void buildPlacaDeVideo(String placaDeVideo);
    Computador getComputador();
}
