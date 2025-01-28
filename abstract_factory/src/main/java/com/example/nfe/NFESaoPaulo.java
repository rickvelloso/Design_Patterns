package com.example.nfe;

import com.example.models.Produto;

public class NFESaoPaulo implements NFE{

    @Override
    public double calcularImposto(Produto produto) {
        return produto.getValorUnitario() * 0.18;
    }

}
