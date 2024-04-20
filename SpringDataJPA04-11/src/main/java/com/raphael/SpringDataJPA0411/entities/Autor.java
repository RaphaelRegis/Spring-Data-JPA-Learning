package com.raphael.SpringDataJPA0411.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long autor_id;
	
	private String nome;
	private int anoNascimento;

}
