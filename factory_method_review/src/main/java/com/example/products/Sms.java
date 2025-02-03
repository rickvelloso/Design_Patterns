package com.example.products;

public class Sms implements Mensagem {

    @Override
    public void enviar() {
        System.out.println("Enviando SMS...");
    }
}
