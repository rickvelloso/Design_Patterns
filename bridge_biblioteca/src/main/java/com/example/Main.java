package com.example;

import com.example.dispositivos.Dispositivo;
import com.example.dispositivos.EReader;
import com.example.dispositivos.PC;
import com.example.formatos_livros.FormatoLivro;
import com.example.formatos_livros.LivroPDF;
import com.example.formatos_livros.LivroePub;

public class Main {
    public static void main(String[] args) {
        FormatoLivro pdf = new LivroPDF();
        FormatoLivro epub = new LivroePub();

        Dispositivo pc = new PC(pdf);
        Dispositivo eReader = new EReader(epub);

        pc.exibirLivro("Design Patterns", "Erich Gamma");

        eReader.exibirLivro("Design Patterns", "Erich Gamma");
        
    }
}