package com.example.Practica2.service;

import com.example.Practica2.dto.MateriaBaseDTO;

import java.util.List;

public interface MateriaBaseService {
    List<MateriaBaseDTO> mostrar();
    MateriaBaseDTO obtenerPorId(Long id);
    MateriaBaseDTO crear(MateriaBaseDTO dto);
    MateriaBaseDTO actualizar(MateriaBaseDTO dto, Long id);
    void eliminar(Long id);
}
