package com.engenhariaIII.mvc.controller;

import com.engenhariaIII.mvc.model.Teste;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TesteController {

    private List<Teste> teste = List.of(
            new Teste(10, 20),
            new Teste(50,100)
    );

    @GetMapping("/teste")
    public List<Teste> getTeste(){
            return teste;
    }

}
