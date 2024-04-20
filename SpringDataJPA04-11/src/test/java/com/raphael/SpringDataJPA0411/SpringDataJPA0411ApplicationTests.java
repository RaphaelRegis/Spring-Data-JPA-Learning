package com.raphael.SpringDataJPA0411;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raphael.SpringDataJPA0411.entities.Autor;
import com.raphael.SpringDataJPA0411.entities.Livro;
import com.raphael.SpringDataJPA0411.repositories.LivroRepository;

@SpringBootTest
class SpringDataJPA0411ApplicationTests {

	@Autowired
	private LivroRepository livroRepository;
	
	@Test
	void LivroEAutorDevemSerSalvos() {
		Autor autor = Autor.builder()
				.nome("Julio Verne")
				.anoNascimento(1828)
				.build();
		
		Livro livro = Livro.builder()
				.titulo("A Volta ao mundo em 80 dias")
				.anoLancamento(1873)
				.idAutor(autor)
				.build();
		
		livroRepository.save(livro);
	}

}
