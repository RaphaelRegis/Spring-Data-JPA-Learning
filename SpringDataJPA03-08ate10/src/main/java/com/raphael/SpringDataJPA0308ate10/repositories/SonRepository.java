package com.raphael.SpringDataJPA0308ate10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.SpringDataJPA0308ate10.entities.Son;

@Repository
public interface SonRepository extends JpaRepository<Son, Long> {

	
}
