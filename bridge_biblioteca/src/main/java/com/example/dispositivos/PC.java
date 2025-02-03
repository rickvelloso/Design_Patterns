package com.example.dispositivos;

import com.example.formatos_livros.FormatoLivro;

public class PC extends Dispositivo {
    public PC(FormatoLivro formatoLivro) {
        super(formatoLivro);
    }

    @Override
    public void exibirLivro(String titulo, String autor) {
        System.out.println("Exibindo livro no PC");
        formatoLivro.imprimirLivro(titulo, autor);
    }

}
