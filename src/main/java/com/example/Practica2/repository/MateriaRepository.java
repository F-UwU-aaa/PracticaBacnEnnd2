package com.example.Practica2.repository;

import com.example.Practica2.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
    Materia findByNombre(String nombre);
    List<Materia> findAllByActivaTrue();
}
