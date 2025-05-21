package com.example.Practica2.service;

import com.example.Practica2.dto.EstudianteDTO;

import java.util.List;

public interface EstudianteService {
    EstudianteDTO crear (EstudianteDTO dto);
    List<EstudianteDTO> listar();
    EstudianteDTO obtenerporId(Long id);
    EstudianteDTO actualizar(Long id, EstudianteDTO dto);
    void eliminar (Long id);
}
