package com.example.models;

import com.example.prototype.Prototype;

public class Documento implements Prototype{
    private final String nome;
    private final String tipo;
    private final String conteudo;
    private final String autor;

    public Documento(String nome, String tipo, String conteudo, String autor) {
        this.nome = nome;
        this.tipo = tipo;
        this.conteudo = conteudo;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public Prototype clonar() {
        return new Documento(nome, tipo, conteudo, autor);
    }

    public void imprimir() {
        System.out.println("Imprimindo documento: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Autor: " + autor);
    }
}
