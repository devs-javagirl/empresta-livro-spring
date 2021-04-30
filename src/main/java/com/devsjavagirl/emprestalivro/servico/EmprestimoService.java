package com.devsjavagirl.emprestalivro.servico;

import com.devsjavagirl.emprestalivro.dominio.Emprestimo;
import com.devsjavagirl.emprestalivro.repositorio.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public void save(Emprestimo emprestimo){
        if (validaDataDevolucao(emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao())) {
            emprestimoRepository.save(emprestimo);
        } else throw new IllegalArgumentException("Data de devolução inválida");
    }

    private Boolean validaDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if (dataDevolucao.isBefore(dataEmprestimo)){
            return false;
        }
        return true;
    }

}
