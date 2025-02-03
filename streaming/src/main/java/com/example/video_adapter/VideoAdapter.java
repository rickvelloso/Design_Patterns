package com.example.video_adapter;

import com.example.video_externo.FormatoExterno;
import com.example.video_factory.Video;

public class VideoAdapter implements Video{
    private final FormatoExterno formatoExterno;

    public VideoAdapter(FormatoExterno formatoExterno) {
        this.formatoExterno = formatoExterno;
    }

    @Override
    public void exibir() {
        formatoExterno.exibir();
    }

}
