package com.example.video_formatos;

import com.example.video_factory.Video;

public class VideoHLS implements Video {
    @Override
    public void exibir() {
        System.out.println("Exibindo vídeo no formato HLS");
    }
}
