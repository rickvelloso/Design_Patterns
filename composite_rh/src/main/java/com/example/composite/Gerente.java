package com.example.composite;

import java.util.ArrayList;
import java.util.List;

import com.example.component.Funcionario;

public class Gerente implements Funcionario {
    private String nome;
    private List<Funcionario> subordinados;
    
    public Gerente(String nome) {
        this.nome = nome;
        this.subordinados = new ArrayList<>();
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "- " + nome + " (Gerente)");
        for (Funcionario funcionario : subordinados) {
            if (funcionario != null) {
                funcionario.exibir(prefixo + "  ");
            }
        }
    }

    public void adicionar(Funcionario funcionario) {
        subordinados.add(funcionario);
    }

    public void remover(Funcionario funcionario) {
        subordinados.remove(funcionario);
    }

}
