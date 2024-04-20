package com.raphael.SpringDataJPA0512.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphael.SpringDataJPA0512.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
