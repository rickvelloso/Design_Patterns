package com.example.documento;

import java.util.ArrayList;
import java.util.List;

import com.example.flyweight.Pagina;

public class Documento {
    private List<Pagina> paginas = new ArrayList<>();

    public void adicionarPagina(Pagina pagina) {
        paginas.add(pagina);
    }

    public void exibirDocumento(){
        for (Pagina pagina : paginas) {
            pagina.exibir("Conteudo da página");
        }
    }
}
