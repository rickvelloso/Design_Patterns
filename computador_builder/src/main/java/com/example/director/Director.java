package com.example.director;

import com.example.builder.ComputadorBuilder;
import com.example.model.Computador;

public class Director {
    private ComputadorBuilder computadorBuilder;

    public Director(ComputadorBuilder computadorBuilder) {
        this.computadorBuilder = computadorBuilder;
    }

    public void construirComputador(String processador, String memoria, String armazenamento, String placaDeVideo) {
        computadorBuilder.buildProcessador(processador);
        computadorBuilder.buildMemoria(memoria);
        computadorBuilder.buildArmazenamento(armazenamento);
        computadorBuilder.buildPlacaDeVideo(placaDeVideo);
    }

    public Computador getComputador() {
        return computadorBuilder.getComputador();
    }
}
