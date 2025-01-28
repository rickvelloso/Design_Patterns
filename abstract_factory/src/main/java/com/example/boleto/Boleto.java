package com.example.boleto;

import com.example.models.Produto;

public interface Boleto {

    public void emitir(Produto produto, double imposto);
}
