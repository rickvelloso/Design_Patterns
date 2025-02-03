package com.example.notificacao;

public class PushNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando notificação por push");
    }

}
