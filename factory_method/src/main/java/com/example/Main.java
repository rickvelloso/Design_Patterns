package com.example;

import com.example.mensagem.Mensagem;
import com.example.mensagem.MensagemFactory;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite a mensagem: ");
        String tipo = JOptionPane.showInputDialog("Digite o tipo de mensagem (email ou sms): ");

        Mensagem mensagem = MensagemFactory.getMensagem(tipo);
        mensagem.enviar(texto);
    }
}