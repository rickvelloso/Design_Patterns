package com.example;

import java.util.Scanner;

import com.example.factories.CartaoDeCreditoFactory;
import com.example.factories.MetodoPagamentoFactory;
import com.example.factories.MobileFactory;
import com.example.factories.PlataformaFactory;
import com.example.factories.WebFactory;
import com.example.metodo_pagamento.MetodoPagamento;
import com.example.plataforma.Plataforma;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        // Escolha da plataforma
        System.out.println("Escolha a plataforma (mobile/web): ");
        String plataformaEscolhida = scanner.nextLine().toLowerCase();
        
        PlataformaFactory plataformaFactory = switch (plataformaEscolhida) {
            case "mobile" -> new MobileFactory();
            case "web" -> new WebFactory();
            default -> null;
        };

        if (plataformaFactory == null) {
            System.out.println("❌ Plataforma inválida!");
            return;
        }

        Plataforma plataforma = plataformaFactory.criarPlataforma();

        // Escolha do método de pagamento
        MetodoPagamentoFactory metodoPagamentoFactory = new CartaoDeCreditoFactory();
        MetodoPagamento metodoPagamento = metodoPagamentoFactory.criarPagamento();

        // Processando o pagamento
        metodoPagamento.pagar(plataforma);

        }
    }
}