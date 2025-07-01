package com.api.livros.libraryapi.DTO;

import com.api.livros.libraryapi.entity.Autor;

import java.time.LocalDate;

public record AutorDTO(String nome, LocalDate DataNascimento, String nacionalidade) {



    public Autor mapearParaAutor() {
    Autor autor = new Autor();
    autor.setNome(this.nome);
    autor.setDataNascimento(this.DataNascimento());
    autor.setNacionalidade(this.nacionalidade);
    return autor;
    }




}

