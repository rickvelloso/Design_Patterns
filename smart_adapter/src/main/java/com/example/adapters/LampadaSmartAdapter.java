package com.example.adapters;

import com.example.devices.LampadaSmart;
import com.example.target.SmartDevice;

public class LampadaSmartAdapter implements SmartDevice{
    private LampadaSmart lampadaSmart;

    public LampadaSmartAdapter(LampadaSmart lampadaSmart) {
        this.lampadaSmart = lampadaSmart;
    }

    @Override
    public void ligar() {
        lampadaSmart.ligarLampada();
    }

    @Override
    public void desligar() {
        lampadaSmart.desligarLampada();
    }
}
