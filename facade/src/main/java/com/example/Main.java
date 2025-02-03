package com.example;

import com.example.facade.ViagemFacade;

public class Main {
    public static void main(String[] args) {
        ViagemFacade viagemFacade = new ViagemFacade();
        viagemFacade.reservar();
    }
}