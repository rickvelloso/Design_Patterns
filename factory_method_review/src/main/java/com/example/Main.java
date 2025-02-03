package com.example;

import com.example.creators.GeradorDeEmail;
import com.example.creators.GeradorDeMensagem;
import com.example.creators.GeradorDeSMS;

public class Main {
    public static void main(String[] args) {
        GeradorDeMensagem geradorDeEmail = new GeradorDeEmail();
        geradorDeEmail.enviarMensagem();

        GeradorDeMensagem geradorDeSMS = new GeradorDeSMS();
        geradorDeSMS.enviarMensagem();
        
    }
}