package com.example.loja;

import com.example.boleto.Boleto;
import com.example.boleto.BoletoBancoBrasil;
import com.example.nfe.NFE;
import com.example.nfe.NFESaoPaulo;
import com.example.venda.VendaFactory;

public class LojaCentroDaInformatica implements VendaFactory {

    @Override
    public NFE criarNFE() {

        NFE notaFiscal = new NFESaoPaulo();

        return notaFiscal;
    }

    @Override
    public Boleto criarBoleto() {

        Boleto boleto = new BoletoBancoBrasil();

        return boleto;
    }

}
