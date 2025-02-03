package com.example.dispositivos;

import com.example.formatos_livros.FormatoLivro;

public class EReader extends Dispositivo {
    public EReader(FormatoLivro formatoLivro) {
        super(formatoLivro);
    }

    @Override
    public void exibirLivro(String titulo, String autor) {
        System.out.println("Exibindo livro no EReader");
        formatoLivro.imprimirLivro(titulo, autor);
    }

}
