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
    public void exibir() {
        System.out.println(nome);
        for (Item item : itens) {
            if (item != null) {
                item.exibir();
            }
        }
    }

    public void adicionar(Item item) {
        itens.add(item);
        System.out.println("Item adicionado");
    }

    public void remover(Item item) {
        itens.remove(item);
        System.out.println("Item removido");    
    }

}
