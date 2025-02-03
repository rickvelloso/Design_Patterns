package com.example.notificacao;

public class SmsNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando notificação por SMS");
    }

}
