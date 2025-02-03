package com.example.formatos_livros;

public class LivroePub implements FormatoLivro {
    @Override
    public void imprimirLivro(String titulo, String autor) {
        System.out.println("Livro ePub: " + titulo + " - " + autor);
    }
}
