package com.example.creators;

import com.example.products.Mensagem;

public abstract class GeradorDeMensagem {
    public abstract Mensagem factoryMethod();

    public void enviarMensagem() {
        Mensagem mensagem = factoryMethod();
        mensagem.enviar();
    }
}
