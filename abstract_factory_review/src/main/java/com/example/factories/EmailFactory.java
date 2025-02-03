package com.example.factories;

import com.example.notificacao.EmailNotificacao;
import com.example.notificacao.Notificacao;

public class EmailFactory  extends NotificacaoFactory{
    @Override
    public Notificacao createNotificacao() {
        return new EmailNotificacao();
    }

}
