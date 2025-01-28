package com.example;

import com.example.modelo.Cliente;
import com.example.modelo.Pedido;
import com.example.modelo.Produto;
import com.example.modelo.Vendedor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");
        cliente.setTelefone("123456789"); 
        cliente.setCodigo(1);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Ciclano");
        vendedor.setCodigo(1);

        Produto produto1 = new Produto();
        produto1.setPrecoUnitario(10.0);
        produto1.setQuantidade(2);
        produto1.setNome("Caderno");

        Produto produto2 = new Produto();
        produto2.setPrecoUnitario(20.0);
        produto2.setQuantidade(3);
        produto2.setNome("Caneta");

        Pedido pedido = new Pedido();
        pedido.setNumeroPedido("1");
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setProdutos(new ArrayList<>());
        pedido.getProdutos().add(produto1);
        pedido.getProdutos().add(produto2);

        pedido.showInfo();
    }

}