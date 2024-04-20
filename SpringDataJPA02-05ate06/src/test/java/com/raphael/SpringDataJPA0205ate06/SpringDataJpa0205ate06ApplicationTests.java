package com.raphael.SpringDataJPA0205ate06;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raphael.SpringDataJPA0205ate06.entities.Student;
import com.raphael.SpringDataJPA0205ate06.entities.Teacher;
import com.raphael.SpringDataJPA0205ate06.repositories.StudentRepository;

@SpringBootTest
class SpringDataJpa0205ate06ApplicationTests {

	@Autowired
	StudentRepository studentRepository;
	
	@Test
	@Disabled
	//serve só para verificar se o salvamento do BD está funcionando
	void StudentShouldBeSavedWithTeacher() {
		
		Teacher teacher = new Teacher("Joao", "Joao@gmail");
		LocalDate birth = LocalDate.of(2003, 5, 26);
		
		Student student = Student.builder()
				.name("Raphael")
				.email("raphael@gmail")
				.birthDate(birth)
				.teacher(teacher)
				.build();
		
		studentRepository.save(student);
	}

}
