package com.devsjavagirl.emprestalivro.repositorio;

import com.devsjavagirl.emprestalivro.dominio.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
