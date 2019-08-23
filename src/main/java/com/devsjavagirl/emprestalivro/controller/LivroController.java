package com.devsjavagirl.emprestalivro.controller;

import com.devsjavagirl.emprestalivro.dominio.Livro;
import com.devsjavagirl.emprestalivro.servico.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/livro")
    public void save(@RequestBody Livro livro){
        livroService.save(livro);
    }
}
