package com.example;

import com.example.facade.CinemaFacade;

public class Main {
    public static void main(String[] args) {
        CinemaFacade cinemaFacade = new CinemaFacade();
        cinemaFacade.comprarIngresso("Matrix", 2);
    }
}