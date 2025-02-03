package com.example.notificacao;

public class EmailNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando notificação por email");
    }

}
