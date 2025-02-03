package com.example.adapters;

import com.example.devices.VentiladorSmart;
import com.example.target.SmartDevice;

public class VentiladorSmartAdapter implements SmartDevice {
    private VentiladorSmart ventiladorSmart;

    public VentiladorSmartAdapter(VentiladorSmart ventiladorSmart) {
        this.ventiladorSmart = ventiladorSmart;
    }

    @Override
    public void ligar() {
        ventiladorSmart.ligarVentilador();
    }

    @Override
    public void desligar() {
        ventiladorSmart.desligarVentilador();
    }

    public void aumentarVelocidade() {
        ventiladorSmart.aumentarVelocidade();
    }

    public void diminuirVelocidade() {
        ventiladorSmart.diminuirVelocidade();
    }

}
