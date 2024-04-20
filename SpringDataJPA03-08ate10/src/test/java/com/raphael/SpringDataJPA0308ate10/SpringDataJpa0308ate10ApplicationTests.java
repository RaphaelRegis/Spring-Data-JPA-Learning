package com.raphael.SpringDataJPA0308ate10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raphael.SpringDataJPA0308ate10.entities.Father;
import com.raphael.SpringDataJPA0308ate10.entities.Son;
import com.raphael.SpringDataJPA0308ate10.repositories.SonRepository;

@SpringBootTest
class SpringDataJpa0308ate10ApplicationTests {

	@Autowired
	private SonRepository sonRepository;
	
	@Test
	void sonAndFatherShouldBeSaved() {
		Father father = Father.builder()
				.name("Antonio")
				.email("antonio@gmail")
				.build();
		
		Son son = Son.builder()
				.name("Raphael")
				.email("raphael@gmail")
				.father(father)
				.build();
		
		sonRepository.save(son);
		
	}

}
