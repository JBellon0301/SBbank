package com.proyect.SBBank.Dao;

import com.proyect.SBBank.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
