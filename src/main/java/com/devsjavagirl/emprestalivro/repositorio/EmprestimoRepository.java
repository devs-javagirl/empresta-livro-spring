package com.devsjavagirl.emprestalivro.repositorio;

import com.devsjavagirl.emprestalivro.dominio.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
