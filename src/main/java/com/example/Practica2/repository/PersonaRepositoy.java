package com.example.Practica2.repository;

import com.example.Practica2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositoy extends JpaRepository<Persona, Long> {
}
