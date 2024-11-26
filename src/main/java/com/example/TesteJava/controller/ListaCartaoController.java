package com.example.TesteJava.controller;

import com.example.TesteJava.application.ListaCartaoApplication;
import org.springframework.stereotype.Component;


@Component
public class ListaCartaoController {

    public ListaCartaoApplication listaCartao;
    public ListaCartaoController(ListaCartaoApplication listaCartao) {
        this.listaCartao = listaCartao;
    }

    @GetMapping("/consulta/cartao")
    public ResponseEntity<String> ConsultaListaCartao (@RequestParam("cpf") String cpf){
        try{
            String data = listaCartao.ListaCartao(cpf);
            return ResponseEntity.Ok(data);
        }catch (Exception ex)
        {
            return new ResponseEntity<String>(ex.getMessage(), null, HttpStatus.BAD_REQUEST);
        }
    }
}
