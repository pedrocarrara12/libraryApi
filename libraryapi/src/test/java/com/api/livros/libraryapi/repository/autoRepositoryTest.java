package com.api.livros.libraryapi.repository;

import com.api.livros.libraryapi.entity.Autor;
import com.api.livros.libraryapi.entity.GeneroLivro;
import com.api.livros.libraryapi.entity.Livro;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;


public class autoRepositoryTest {

    @Test
    void salvarAutorComLivros() {
        Autor autor = new Autor("karlo", LocalDate.of(2000,10,15),"Brasil");
        Livro livro = new Livro();
        livro.setIsbn("23232");
        livro.setPreco(BigDecimal.valueOf(1700));
        livro.setGenero(GeneroLivro.FANTASIA);
        livro.setTitulo("CASA-2");

        autor.setLivros(new ArrayList<>());
        autor.getLivros().add(livro);


    }
}
