package com.devsjavagirl.emprestalivro.servico;

import com.devsjavagirl.emprestalivro.dominio.Emprestimo;
import com.devsjavagirl.emprestalivro.repositorio.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public void save(Emprestimo emprestimo){
        emprestimoRepository.save(emprestimo);
    }

}
