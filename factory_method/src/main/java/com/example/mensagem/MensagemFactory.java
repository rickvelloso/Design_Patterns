package com.example.mensagem;

public class MensagemFactory {

    public static Mensagem getMensagem(String tipo) {
        return switch (tipo) {
            case "SMS" -> new MensagemSMS();
            case "Email" -> new MensagemEmail();
            default -> throw new IllegalArgumentException("Tipo de mensagem desconhecido");
        };
    }

}
