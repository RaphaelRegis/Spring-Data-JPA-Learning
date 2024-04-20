package com.raphael.SpringDataJPA0411.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphael.SpringDataJPA0411.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
