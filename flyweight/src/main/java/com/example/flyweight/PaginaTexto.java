package com.example.flyweight;

public class PaginaTexto implements Pagina {
    private String tipoConteudo;

    public PaginaTexto() {
        this.tipoConteudo = "texto";
    }

    @Override
    public void exibir(String conteudo) {
        System.out.println("Tipo de conteúdo: " + tipoConteudo + ", conteúdo: " + conteudo);
    }
}
