package com.example.produto;

public class Pizza {
    private String massa;
    private String queijo;
    private String cobertura;

    public Pizza() {
    }

    public Pizza(String massa, String queijo, String cobertura) {
        this.massa = massa;
        this.queijo = queijo;
        this.cobertura = cobertura;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMolho() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", queijo='" + queijo + '\'' +
                ", cobertura='" + cobertura + '\'' +
                '}';
    }    
}
