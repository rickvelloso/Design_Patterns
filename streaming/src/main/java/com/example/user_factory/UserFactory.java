package com.example.user_factory;

import com.example.user_planos.UserGratuito;
import com.example.user_planos.UserPremium;

public class UserFactory {
    public static User createUser(String tipo) {
        return switch (tipo) {
            case "gratuito" -> new UserGratuito();
            case "premium" -> new UserPremium();
            default -> null;
        };
    }
}
