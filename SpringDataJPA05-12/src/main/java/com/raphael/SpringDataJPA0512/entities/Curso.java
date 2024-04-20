package com.raphael.SpringDataJPA0512.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long curso_id;
	
	private String nome_do_curso;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "disciplina_aluno",
			joinColumns = @JoinColumn(name = "curso_id"),
			inverseJoinColumns = @JoinColumn(name = "aluno_id")	
			)
	private List<Aluno> alunos;

}
