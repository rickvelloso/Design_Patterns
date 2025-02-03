package com.example.user_planos;

import com.example.proxy.ProxyVideo;
import com.example.user_factory.User;
import com.example.video_factory.Video;

public class UserGratuito implements User {
    
    @Override
    public void exibirVideo(Video video) {
        Video proxyVideo = new ProxyVideo(video);
        proxyVideo.exibir();
    }

}
