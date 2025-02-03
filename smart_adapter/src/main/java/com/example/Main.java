package com.example;

import com.example.adapters.ArCondicionadoSmartAdapter;
import com.example.devices.ArCondicionadoSmart;
import com.example.target.SmartDevice;


public class Main {
    public static void main(String[] args) {
        ArCondicionadoSmart arCondcionadoSmart = new ArCondicionadoSmart();
        SmartDevice arCondcionadoSmartAdapter = new ArCondicionadoSmartAdapter(arCondcionadoSmart);
        arCondcionadoSmartAdapter.ligar();
        arCondcionadoSmartAdapter.desligar();

        if(arCondcionadoSmart instanceof ArCondicionadoSmart){
            ArCondicionadoSmartAdapter adapter = (ArCondicionadoSmartAdapter) arCondcionadoSmartAdapter;
            adapter.aumentarTemperatura();
            adapter.diminuirTemperatura();
        }
    }
}