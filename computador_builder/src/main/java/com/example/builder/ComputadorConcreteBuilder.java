package com.example.builder;

import com.example.model.Computador;

public class ComputadorConcreteBuilder implements ComputadorBuilder {
    private Computador computador;

    public ComputadorConcreteBuilder() {
        computador = new Computador(" ", " ", " ", " ");
    }
    
    @Override
    public void buildProcessador(String processador) {
        computador.setProcessador(processador);
    }

    @Override
    public void buildMemoria(String memoria) {
        computador.setMemoria(memoria);
    }

    @Override
    public void buildArmazenamento(String armazenamento) {
        computador.setArmazenamento(armazenamento);
    }

    @Override
    public void buildPlacaDeVideo(String placaDeVideo) {
        computador.setPlacaDeVideo(placaDeVideo);
    }

    @Override
    public Computador getComputador() {
        return computador;
    }

}
