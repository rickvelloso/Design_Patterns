package com.example.factories;

import com.example.notificacao.Notificacao;

public abstract class NotificacaoFactory {
    public abstract Notificacao createNotificacao();

    public void enviarNotificacao() {
        Notificacao notificacao = createNotificacao();
        notificacao.enviar();
    }
}
