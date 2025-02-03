package com.example.model;

public class Computador {
    private String processador;
    private String memoria;
    private String armazenamento;
    private String placaDeVideo;

    public Computador(String processador, String memoria, String armazenamento, String placaDeVideo) {
        this.processador = processador;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    @Override   
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                ", placaDeVideo='" + placaDeVideo + '\'' +
                '}';
    }
    

}
