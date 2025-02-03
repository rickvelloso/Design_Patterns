package com.example.leaf;

import com.example.component.Item;

public class Arquivo implements Item {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println(nome);
    }

}
