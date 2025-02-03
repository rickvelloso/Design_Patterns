package com.example.products;

public class Email implements Mensagem {

    @Override
    public void enviar() {
        System.out.println("Enviando e-mail...");
    }

}
