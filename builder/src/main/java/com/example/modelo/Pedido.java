package com.example.modelo;

import java.util.List;

public class Pedido {

    private String numeroPedido;

    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;

    public double getValorTotal(){
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPrecoUnitario() * produto.getQuantidade();
        }
        return valorTotal;
    }

    public int getTotalProdutos(){
        int total = 0;
        for (Produto produto : produtos) {
            total += produto.getQuantidade();
        }
        return total;
    }

    public String getNumeroPedido() {
        return numeroPedido;

    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void showInfo() {
        System.out.println("Pedido Número: " + numeroPedido);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Produtos:");
        double totalPrice = 0.0;
        for (Produto produto : produtos) {
            double productTotal = produto.getQuantidade() * produto.getPrecoUnitario();
            totalPrice += productTotal;
            System.out.println(" - " + produto.getNome() + ": " + produto.getQuantidade() + " unidades, Preço Unitário: " + produto.getPrecoUnitario() + ", Preço Total: " + productTotal);
        }
        System.out.println("Total de Produtos: " + getTotalProdutos());
        System.out.println("Preço Total do Pedido: " + totalPrice);
    }
}
