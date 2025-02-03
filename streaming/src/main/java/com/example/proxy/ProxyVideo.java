package com.example.proxy;

import com.example.video_factory.Video;

public class ProxyVideo implements Video {
    private Video videoReal;
    private final Video video;

    public ProxyVideo(Video video) {
        this.video = video;
    }

    @Override
    public void exibir() {
        if (videoReal == null) {
            videoReal = video; 
        }
        videoReal.exibir();
    }

}
