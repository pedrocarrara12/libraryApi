package com.api.livros.libraryapi.repository;

import com.api.livros.libraryapi.entity.Autor;
import com.api.livros.libraryapi.entity.GeneroLivro;
import com.api.livros.libraryapi.entity.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
@SpringBootTest
public class AutorRepositoryTest {

    @Autowired
    AutorRepository autorRepository;


    @Test
    public void salvarTeste() {
        Autor autor = new Autor("jkoao", LocalDate.of(2000,03,10),"Espanha");
    autorRepository.save(autor);



    }
}
