package com.example;

import com.example.builder.PedidoBuilder;
import com.example.modelo.Pedido;

public class MainBuilder {

    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
            .setPedido("1")
            .setCliente(100, "Fulano", "123456789") 
            .setVendedor(1, "Ciclano")
            .setProduto("Caderno", 10.0, 2)
            .setProduto("Caneta", 20.0, 5)
            .build();

    pedido.showInfo();

    }
}
