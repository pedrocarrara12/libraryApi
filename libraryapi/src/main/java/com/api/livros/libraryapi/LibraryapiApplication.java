package com.api.livros.libraryapi;

import com.api.livros.libraryapi.entity.Autor;
import com.api.livros.libraryapi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryapiApplication.class, args);
	}


}



