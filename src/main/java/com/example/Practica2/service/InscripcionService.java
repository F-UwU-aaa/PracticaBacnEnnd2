package com.example.Practica2.service;

import com.example.Practica2.dto.InscripcionDTO;
import com.example.Practica2.dto.InscripcionRequestDTO;

import java.util.List;

public interface InscripcionService {

    InscripcionDTO inscribir (InscripcionRequestDTO inscripcionRequestDTO);
    List<InscripcionDTO> listar();
    List<InscripcionDTO> obtenerPorIdEstudiante(Long idEstudiante);
    InscripcionDTO actualizar (Long id, InscripcionDTO inscripcionDTO);
    void eliminar (Long id);
    InscripcionDTO obtenerPorId (Long id);
    List<InscripcionDTO> obtenerPorIdParalelo (Long idParalelo);
}
