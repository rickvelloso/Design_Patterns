package com.example.builder;

import java.util.ArrayList;

import com.example.modelo.Cliente;
import com.example.modelo.Pedido;
import com.example.modelo.Produto;
import com.example.modelo.Vendedor;

public class PedidoBuilder {
    private Pedido instancia;

    public PedidoBuilder() {
        instancia = new Pedido();
    }

    public PedidoBuilder setPedido(String numeroPedido){
        instancia.setNumeroPedido(numeroPedido);
        return this;
    }

    public PedidoBuilder setCliente(int codigo, String nome, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        instancia.setCliente(cliente);
        return this;
    }

    public PedidoBuilder setVendedor(int codigo, String nome) {
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(codigo);
        vendedor.setNome(nome);
        instancia.setVendedor(vendedor);
        return this;
    }   
    
    public PedidoBuilder setProduto(String nome, double precoUnitario, int quantidade) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPrecoUnitario(precoUnitario);
        produto.setQuantidade(quantidade);
        
        if(instancia.getProdutos() == null) {
            instancia.setProdutos(new ArrayList<Produto>());
        }
        instancia.getProdutos().add(produto);
        return this;
    }

    public Pedido build() {
        return instancia;
    }
}
