package com.example.user_planos;

import com.example.gateway.GatewayPagamento;
import com.example.pagamento.Pagamento;
import com.example.proxy.ProxyVideo;
import com.example.user_factory.User;
import com.example.video_factory.Video;

public class UserGratuito implements User {
    
    @Override
    public void exibirVideo(Video video) {
        Video proxyVideo = new ProxyVideo(video);
        proxyVideo.exibir();
    }

    @Override
    public User realizarPagamento(String plano, GatewayPagamento gateway, Pagamento metodoPagamento) {
        double valor = plano.equals("mensal") ? 30 : 300;

        metodoPagamento.realizarPagamento(valor);

        return new UserPremium();
    }

}
