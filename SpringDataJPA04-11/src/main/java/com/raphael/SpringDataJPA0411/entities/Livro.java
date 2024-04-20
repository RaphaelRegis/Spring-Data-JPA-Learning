package com.raphael.SpringDataJPA0411.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long livro_id;
	
	private String titulo;
	private int anoLancamento;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "autor_id", referencedColumnName = "autor_id")
	private Autor idAutor;
}
