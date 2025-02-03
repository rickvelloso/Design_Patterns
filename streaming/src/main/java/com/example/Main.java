package com.example;

import com.example.gateway.GatewayPagamento;
import com.example.gateway.GatewayPayPal;
import com.example.pagamento.Pagamento;
import com.example.pagamento.PagamentoCartao;
import com.example.user_factory.User;
import com.example.user_factory.UserFactory;
import com.example.video_factory.Video;
import com.example.video_factory.VideoFactory;

public class Main {
    public static void main(String[] args) {
    //     // Criando usuários
    //     User usuarioGratuito = UserFactory.createUser("gratuito");
    //     User usuarioPremium = UserFactory.createUser("premium");

    //     // Criando vídeos internos
    //     Video videoHLS = VideoFactory.createVideo("hls");
    //     Video videoMPEG = VideoFactory.createVideo("mpeg");

    //     // Criando vídeos externos adaptados
    //     Video videoMKV = new VideoAdapter(new VideoMKV());
    //     Video videoAVI = new VideoAdapter(new VideoAVI());

    //     // Exibindo vídeos no sistema
    //     usuarioGratuito.exibirVideo(videoHLS);
    //     usuarioPremium.exibirVideo(videoMPEG);
        
    //     // Exibindo vídeos externos adaptados
    //     usuarioGratuito.exibirVideo(videoMKV);
    //     usuarioPremium.exibirVideo(videoAVI);


        User userGratuito = UserFactory.createUser("gratuito");
        User userPremium = UserFactory.createUser("premium");

        // Criando vídeos dinamicamente
        Video videoHLS = VideoFactory.createVideo("hls");
        Video videoMPEG = VideoFactory.createVideo("mpeg");

        userGratuito.exibirVideo(videoHLS);

        GatewayPagamento gatewayPayPal = new GatewayPayPal();
        Pagamento metodoPagamento = new PagamentoCartao(gatewayPayPal);

        userGratuito.realizarPagamento("mensal", gatewayPayPal, metodoPagamento);

        userGratuito.exibirVideo(videoMPEG);

        
    }
}