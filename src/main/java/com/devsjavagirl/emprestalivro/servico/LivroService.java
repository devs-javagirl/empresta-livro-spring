package com.devsjavagirl.emprestalivro.servico;

import com.devsjavagirl.emprestalivro.dominio.Livro;
import com.devsjavagirl.emprestalivro.repositorio.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public void save(Livro livro){
        livroRepository.save(livro);
    }
}
