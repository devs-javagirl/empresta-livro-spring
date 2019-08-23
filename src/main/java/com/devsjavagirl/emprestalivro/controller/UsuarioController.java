package com.devsjavagirl.emprestalivro.controller;

import com.devsjavagirl.emprestalivro.dominio.Usuario;
import com.devsjavagirl.emprestalivro.servico.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public void save(@RequestBody Usuario usuario){
        usuarioService.salvaUsuario(usuario);
    }
}
