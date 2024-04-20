package com.raphael.SpringDataJPA0205ate06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.SpringDataJPA0205ate06.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
