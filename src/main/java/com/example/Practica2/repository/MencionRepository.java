package com.example.Practica2.repository;

import com.example.Practica2.model.Mencion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MencionRepository extends JpaRepository<Mencion, Long>{
    Mencion findByNombre(String nombre);

}
