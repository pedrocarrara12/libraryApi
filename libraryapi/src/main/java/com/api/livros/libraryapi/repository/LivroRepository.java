package com.api.livros.libraryapi.repository;

import com.api.livros.libraryapi.entity.Autor;
import com.api.livros.libraryapi.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {
    List<Livro> findByAutor(Autor autor);

    List<Livro> findByTitulo(String titulo);

    List<Livro> findByTituloOrPreco(String titu, BigDecimal preco);
    List<Livro> findByIsbn(String isbn);
    List<Livro> findByTituloAndPreco(String titulo, BigDecimal preco);

    @Query("select l from Livro l order by l.preco")
    List<Livro> listarLivrosOrdenadosPorPreco();

    @Query("SELECT l FROM Livro l WHERE LOWER(l.titulo) LIKE 'a%'")
    List<Livro> listarLivrosComA();

    @Query("SELECT l FROM Livro l WHERE LOWER(l.titulo) LIKE CONCAT(LOWER(?1), '%') AND l.preco >= ?2")
    List<Livro> buscarPorParametro(String titulo, BigDecimal preco);


}
