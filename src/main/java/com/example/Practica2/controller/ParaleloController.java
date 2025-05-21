package com.example.Practica2.controller;

import com.example.Practica2.dto.ParaleloDTO;
import com.example.Practica2.service.ParaleloService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paralelos")
@RequiredArgsConstructor
public class ParaleloController {

    private final ParaleloService paraleloService;

    @GetMapping
    public ResponseEntity<List<ParaleloDTO>> listar(){
        return ResponseEntity.ok(paraleloService.listar());
    }

    @PostMapping("/asignar-docente")
    public ResponseEntity<ParaleloDTO> crear(@Valid @RequestBody ParaleloDTO dto){
        return ResponseEntity.status(201).body(paraleloService.crear(dto));
    }

}
