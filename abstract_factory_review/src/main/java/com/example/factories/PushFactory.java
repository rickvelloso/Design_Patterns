package com.example.factories;

import com.example.notificacao.Notificacao;
import com.example.notificacao.PushNotificacao;

public class PushFactory extends NotificacaoFactory{
        @Override
        public Notificacao createNotificacao() {
            return new PushNotificacao();
        }

}
