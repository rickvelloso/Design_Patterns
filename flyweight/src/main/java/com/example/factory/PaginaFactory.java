package com.example.factory;

import java.util.HashMap;
import java.util.Map;

import com.example.flyweight.Pagina;
import com.example.flyweight.PaginaTexto;

public class PaginaFactory {
    private Map<String, Pagina> paginaCache = new HashMap<>();

    public Pagina getPagina(String tipo){
        if(!paginaCache.containsKey(tipo)){
            if (tipo.equals("Texto")) 
            {
                paginaCache.put(tipo, new PaginaTexto());
            }}
        return paginaCache.get(tipo);
    }
}
