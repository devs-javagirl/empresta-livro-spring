package com.devsjavagirl.emprestalivro.dominio;

import javax.persistence.*;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue
    private Long codigo;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Livro livro;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
