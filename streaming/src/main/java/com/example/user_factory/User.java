package com.example.user_factory;

import com.example.gateway.GatewayPagamento;
import com.example.pagamento.Pagamento;
import com.example.video_factory.Video;

public interface User {
    void exibirVideo(Video video);
    User realizarPagamento(String plano, GatewayPagamento gateway, Pagamento metodoPagamento);
}
