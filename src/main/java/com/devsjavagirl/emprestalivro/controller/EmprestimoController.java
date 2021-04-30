package com.devsjavagirl.emprestalivro.controller;

import com.devsjavagirl.emprestalivro.dominio.Emprestimo;
import com.devsjavagirl.emprestalivro.servico.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping(value = "/emprestimo", consumes = "application/json")
    public void save(@RequestBody Emprestimo emprestimo){
        emprestimoService.save(emprestimo);
    }
}
