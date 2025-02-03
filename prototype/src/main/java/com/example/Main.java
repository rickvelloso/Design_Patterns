package com.example;

import com.example.models.Documento;

public class Main {
    public static void main(String[] args) {
        // Criação do documento protótipo
        Documento documentoOriginal = new Documento("Relatório de Vendas", "Relatório", "Conteúdo do relatório de vendas.", "João Silva");

        // Imprimindo o documento original
        documentoOriginal.imprimir();

        // Clonando o documento
        Documento documentoClonado = (Documento) documentoOriginal.clonar();
        
        // Modificando atributos do documento clonado
        // Alterar nome do documento clonado
        documentoClonado = new Documento("Relatório de Marketing", documentoClonado.getTipo(), documentoClonado.getConteudo(), documentoClonado.getAutor());

        // Imprimindo o documento clonado
        documentoClonado.imprimir();
    }
}