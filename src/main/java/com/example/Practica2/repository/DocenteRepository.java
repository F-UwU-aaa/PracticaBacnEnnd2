package com.example.Practica2.repository;

import com.example.Practica2.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Docente, Long> {
    Docente findByNombre(String nombre);
    Docente findByCi(String ci);

}
