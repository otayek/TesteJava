package com.example.TesteJava.application;

import com.example.TesteJava.service.ListaCartaoService;
import org.springframework.beans.factory.annotation.Autowired;

public class ListaCartaoApplication {

    @Autowired
    private ListaCartaoService listaCartaoService;

    public ListaCartaoApplication (ListaCartaoService listaCartaoService) {
        this.listaCartaoService = listaCartaoService;
    }

    public String ListaCartao(String cpf) {
        return listaCartaoService.ListaCartao(cpf);
    }
}
