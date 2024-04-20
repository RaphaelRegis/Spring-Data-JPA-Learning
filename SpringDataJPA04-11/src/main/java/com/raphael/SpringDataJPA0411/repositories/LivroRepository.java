package com.raphael.SpringDataJPA0411.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphael.SpringDataJPA0411.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
