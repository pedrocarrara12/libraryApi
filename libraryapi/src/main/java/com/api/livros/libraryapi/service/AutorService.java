package com.api.livros.libraryapi.service;

import com.api.livros.libraryapi.entity.Autor;
import com.api.livros.libraryapi.repository.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }
    public Autor salvar(Autor autor) {
       return autorRepository.save(autor);
    }

}
