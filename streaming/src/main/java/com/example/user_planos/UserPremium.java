package com.example.user_planos;

import com.example.user_factory.User;
import com.example.video_factory.Video;

public class UserPremium implements User {
    
    @Override
    public void exibirVideo(Video video) {
        System.out.print("Usuário Premium: ");
        video.exibir();
    }

}
