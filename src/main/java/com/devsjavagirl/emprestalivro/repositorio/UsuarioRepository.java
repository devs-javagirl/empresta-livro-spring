package com.devsjavagirl.emprestalivro.repositorio;

import com.devsjavagirl.emprestalivro.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
