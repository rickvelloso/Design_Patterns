package com.example.factories;

import com.example.notificacao.Notificacao;
import com.example.notificacao.SmsNotificacao;

public class SmsFactory extends NotificacaoFactory{
    @Override
    public Notificacao createNotificacao() {
        return new SmsNotificacao();
    }

}
