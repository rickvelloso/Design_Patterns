package com.example.venda;

import com.example.boleto.Boleto;
import com.example.nfe.NFE;

public interface VendaFactory {

    public NFE criarNFE();

    public Boleto criarBoleto();

    

}
