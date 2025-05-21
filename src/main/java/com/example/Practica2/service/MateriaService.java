package com.example.Practica2.service;

import com.example.Practica2.dto.MateriaDTO;

import java.util.List;



public interface MateriaService {
    List<MateriaDTO> listar();
    MateriaDTO crear(MateriaDTO materiaDTO);

}
