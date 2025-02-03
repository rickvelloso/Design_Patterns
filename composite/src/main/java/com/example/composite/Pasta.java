package com.example.composite;

import java.util.ArrayList;
import java.util.List;

import com.example.component.Item;

public class Pasta implements Item {
    private String nome;
    private List<Item> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "[Pasta] " + nome);
        for (Item item : itens) {
            if (item != null) {
                item.exibir(prefixo + "  ");
            }
        }
    }

    public void adicionar(Item item) {
        itens.add(item);
        System.out.println("Item adicionado" + ((item instanceof Pasta) ? "[Pasta]" : "") + item);
    }

    public void remover(Item item) {
        itens.remove(item);
        System.out.println("Item removido" + ((item instanceof Pasta) ? "[Pasta]" : "")+ item);    
    }

}
