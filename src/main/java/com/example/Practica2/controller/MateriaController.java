package com.example.Practica2.controller;

import com.example.Practica2.dto.MateriaBaseDTO;
import com.example.Practica2.dto.MateriaDTO;
import com.example.Practica2.service.MateriaBaseService;
import com.example.Practica2.service.MateriaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/materias")
@RequiredArgsConstructor
public class MateriaController {
    private final MateriaService materiaService;
    private final MateriaBaseService materiaBaseService;

    @GetMapping
    public ResponseEntity<List<MateriaBaseDTO>> mostrar(){
        return ResponseEntity.ok(materiaBaseService.mostrar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<MateriaBaseDTO> obtenerPorId(@PathVariable Long id){
        return ResponseEntity.ok(materiaBaseService.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<MateriaBaseDTO> crear(@Valid @RequestBody MateriaBaseDTO dto){
        return ResponseEntity.status(201).body(materiaBaseService.crear(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MateriaBaseDTO> actualizar(@PathVariable Long id, @Valid @RequestBody MateriaBaseDTO dto){
        return ResponseEntity.ok(materiaBaseService.actualizar(dto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MateriaBaseDTO> eliminar(@PathVariable Long id){
        materiaBaseService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/materia-mencion")
    public ResponseEntity<List<MateriaDTO>> listar(){
        return ResponseEntity.ok(materiaService.listar());
    }

    @PostMapping("/materia-mencion")
    public ResponseEntity<MateriaDTO> crear(@Valid @RequestBody MateriaDTO dto){
        return ResponseEntity.status(201).body(materiaService.crear(dto));
    }



}
