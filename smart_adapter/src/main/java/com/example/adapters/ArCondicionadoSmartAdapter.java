package com.example.adapters;

import com.example.devices.ArCondicionadoSmart;
import com.example.target.SmartDevice;

public class ArCondicionadoSmartAdapter implements SmartDevice {
    private ArCondicionadoSmart arCondicionadoSmart;

    public ArCondicionadoSmartAdapter(ArCondicionadoSmart arCondicionadoSmart) {
        this.arCondicionadoSmart = arCondicionadoSmart;
    }

    @Override
    public void ligar() {
        arCondicionadoSmart.ligarArCondicionado();
    }

    @Override
    public void desligar() {
        arCondicionadoSmart.desligarArCondicionado();
    }

    public void aumentarTemperatura() {
        arCondicionadoSmart.aumentarTemperatura();
    }

    public void diminuirTemperatura() {
        arCondicionadoSmart.diminuirTemperatura();
    }

}
