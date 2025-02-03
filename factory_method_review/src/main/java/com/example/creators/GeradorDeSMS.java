package com.example.creators;

import com.example.products.Mensagem;
import com.example.products.Sms;

public class GeradorDeSMS extends GeradorDeMensagem {
    @Override
    public Mensagem factoryMethod() {
        return new Sms();
    }

}
