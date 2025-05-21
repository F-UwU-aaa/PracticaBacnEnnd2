package com.example.Practica2.repository;

import com.example.Practica2.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    boolean existsByCi(String ci);
    boolean existsByEmail(String email);
    boolean existsByMatricula(String matricula);
    List<Estudiante> findAllByActivoTrue();
}
