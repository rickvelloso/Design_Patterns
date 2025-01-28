package com.example.venda;

import com.example.boleto.Boleto;
import com.example.models.Produto;
import com.example.nfe.NFE;

public class Venda {

    private NFE notaFiscal;
    private Boleto boleto;
    public Venda(VendaFactory factory){
        this.notaFiscal = factory.criarNFE();

        this.boleto = factory.criarBoleto();
    }

    public void realizarVenda(Produto produto){
        double imposto = this.notaFiscal.calcularImposto(produto);
        this.boleto.emitir(produto, imposto);
    }
}
