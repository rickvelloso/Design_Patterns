package com.example.dispositivos;

import com.example.formatos_livros.FormatoLivro;

public abstract class Dispositivo {
    FormatoLivro formatoLivro;

    public Dispositivo(FormatoLivro formatoLivro) {
        this.formatoLivro = formatoLivro;
    }

    public abstract void exibirLivro(String titulo, String autor);
}
