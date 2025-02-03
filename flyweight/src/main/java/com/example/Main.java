package com.example;

import com.example.documento.Documento;
import com.example.factory.PaginaFactory;
import com.example.flyweight.Pagina;

public class Main {
    public static void main(String[] args) {
        PaginaFactory paginaFactory = new PaginaFactory();

        Documento documento = new Documento();

        Pagina pagina1 = paginaFactory.getPagina("Texto");
        documento.adicionarPagina(pagina1);

        Pagina pagina2 = paginaFactory.getPagina("Texto");
        documento.adicionarPagina(pagina2);

        documento.exibirDocumento();
    }
}