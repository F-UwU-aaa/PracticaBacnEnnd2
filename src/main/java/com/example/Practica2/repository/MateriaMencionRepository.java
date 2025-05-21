package com.example.Practica2.repository;

import com.example.Practica2.model.Materia;
import com.example.Practica2.model.MateriaMencion;
import com.example.Practica2.model.MateriaMencionId;
import com.example.Practica2.model.Mencion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MateriaMencionRepository extends JpaRepository<MateriaMencion, MateriaMencionId> {

    MateriaMencion findByMateria(Materia materia);
    Optional<MateriaMencion> findByMateriaAndMencion(Materia materia, Mencion mencion);
}
