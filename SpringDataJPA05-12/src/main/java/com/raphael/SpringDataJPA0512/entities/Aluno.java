package com.raphael.SpringDataJPA0512.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aluno_id;
	
	private String nome;
	private String email;
	
	@ManyToMany(mappedBy = "alunos")
	private List<Curso> cursos;
}
