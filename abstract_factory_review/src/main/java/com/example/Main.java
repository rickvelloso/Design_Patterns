package com.example;

import com.example.factories.EmailFactory;
import com.example.factories.NotificacaoFactory;
import com.example.factories.PushFactory;
import com.example.factories.SmsFactory;

public class Main {
    public static void main(String[] args) {
        NotificacaoFactory factorySms = new SmsFactory();
        factorySms.enviarNotificacao();

        NotificacaoFactory factoryEmail = new EmailFactory();
        factoryEmail.enviarNotificacao();

        NotificacaoFactory factoryPush = new PushFactory();
        factoryPush.enviarNotificacao();

    }
}