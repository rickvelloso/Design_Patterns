package com.example.real_subject;

import com.example.subject.Imagem;

public class ImagemReal implements Imagem {
    private String nome;

    public ImagemReal(String nome) {
        this.nome = nome;
        carregarImagem();
    }

    private void carregarImagem() {
        System.out.println("Carregando " + nome);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo " + nome);
    }

}
