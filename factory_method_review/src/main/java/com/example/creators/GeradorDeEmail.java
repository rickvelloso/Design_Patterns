package com.example.creators;

import com.example.products.Email;
import com.example.products.Mensagem;

public class GeradorDeEmail extends GeradorDeMensagem {
    @Override
    public Mensagem factoryMethod() {
        return new Email();
    }

}
