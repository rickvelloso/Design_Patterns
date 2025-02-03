package com.example.facade;

import com.example.subsistemas.CarroAluguel;
import com.example.subsistemas.Hotel;
import com.example.subsistemas.Seguro;
import com.example.subsistemas.Voo;

public class ViagemFacade {
    private Voo voo;
    private Hotel hotel;
    private CarroAluguel carroAluguel;
    private Seguro seguro;

    public ViagemFacade() {
        this.voo = new Voo();
        this.hotel = new Hotel();
        this.carroAluguel = new CarroAluguel();
        this.seguro = new Seguro();
    }

    public void reservar(){
        voo.reservarVoo();
        hotel.reservar();
        carroAluguel.alugar();
        seguro.contratar();
    }
}
