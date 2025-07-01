package com.api.livros.libraryapi.repository;


import com.api.livros.libraryapi.entity.Autor;
import com.api.livros.libraryapi.entity.GeneroLivro;
import com.api.livros.libraryapi.entity.Livro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class LivroRepositoryTest {

    @Autowired
    LivroRepository repository;
    @Autowired
    AutorRepository autorRepository;


    @Test
    void salvarTest() {
        Autor autor = new Autor("Joao", LocalDate.of(2000, 3, 10), "Brasil");
        autor = autorRepository.save(autor); // salva e retorna o autor com ID

        Livro livro = new Livro();
        livro.setIsbn("312");
        livro.setTitulo("Amor");
        livro.setPreco(BigDecimal.valueOf(40));
        livro.setGenero(GeneroLivro.ROMANCE);
        livro.setAutor(autor); // associação feita

        repository.save(livro);
    }
    @Test
    void buscarLivroTest() {
        String titulo = "TESTE";
        BigDecimal preco = new BigDecimal(40);

         List<Livro> livro = repository.findByTituloOrPreco(titulo, preco);
        for (Livro livro1 : livro) {
            System.out.println(livro1);

        }
    }
    @Test
    void TestarLivroComQuerySQL() {
           List<Livro> livros =repository.listarLivrosOrdenadosPorPreco();
           livros.forEach(l -> System.out.println(l));


        }
    @Test
    void TestarLivrosComLetraASQL() {
        List<Livro> livroscomA = repository.listarLivrosComA();
        livroscomA.forEach(livro -> System.out.println(livro));
    }
    @Test
    void buscarLivroquery() {
       List<Livro> livrosq = repository.buscarPorParametro("A",new BigDecimal(10));
       livrosq.forEach(System.out::println);
        System.out.println("teste");

    }

    }

