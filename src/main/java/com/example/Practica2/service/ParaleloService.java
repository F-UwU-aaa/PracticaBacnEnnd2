package com.example.Practica2.service;

import com.example.Practica2.dto.ParaleloDTO;

import java.util.List;

public interface ParaleloService {
    ParaleloDTO crear (ParaleloDTO dto);
    List<ParaleloDTO> listar();
}
