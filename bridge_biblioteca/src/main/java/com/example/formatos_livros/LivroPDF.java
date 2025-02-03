package com.example.formatos_livros;

public class LivroPDF implements FormatoLivro {
    @Override
    public void imprimirLivro(String titulo, String autor) {
        System.out.println("Livro PDF: " + titulo + " - " + autor);
    }
}
