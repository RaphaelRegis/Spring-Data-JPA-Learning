package com.raphael.SpringDataJPA0308ate10.entities;

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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Father {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long fatherId;
	private String name;
	private String email;
	
	
}
