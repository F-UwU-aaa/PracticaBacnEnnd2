package com.example.Practica2.registro.dto;

import com.example.Practica2.model.Persona;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SessionInfoDTO {
    private String username;
    private String rol;
    private Persona persona;
}