package com.example.leaf;

import com.example.component.Funcionario;

public class Dev implements Funcionario {
    private String nome;

    public Dev(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "- " + nome);
    }

}
