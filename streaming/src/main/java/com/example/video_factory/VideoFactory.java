package com.example.video_factory;

import com.example.video_formatos.VideoHLS;
import com.example.video_formatos.VideoMPEG;

public class VideoFactory {
    public static Video createVideo(String tipo) {
        return switch (tipo) {
            case "hls" -> new VideoHLS();
            case "mpeg" -> new VideoMPEG();
            default -> null;
        };
    }
}
