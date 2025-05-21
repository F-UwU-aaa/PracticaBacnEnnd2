package com.example.Practica2.controller;

import com.example.Practica2.dto.InscripcionDTO;
import com.example.Practica2.dto.InscripcionRequestDTO;
import com.example.Practica2.service.InscripcionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscripcion")
@RequiredArgsConstructor
public class InscripcionController {

    private final InscripcionService inscripcionService;

    @GetMapping
    public ResponseEntity<List<InscripcionDTO>> listar(){
        return ResponseEntity.ok(inscripcionService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InscripcionDTO> obtenerPorId(@PathVariable Long id){
        return ResponseEntity.ok(inscripcionService.obtenerPorId(id));
    }

    @GetMapping("{id}/estudiante")
    public ResponseEntity<List<InscripcionDTO>> obtenerPorIdEstudiante(@PathVariable Long id){
        return ResponseEntity.ok(inscripcionService.obtenerPorIdEstudiante(id));
    }
    @GetMapping("{id}/paralelo")
    public ResponseEntity<List<InscripcionDTO>> obtenerPorIdParalelo(@PathVariable Long id){
        return ResponseEntity.ok(inscripcionService.obtenerPorIdParalelo(id));
    }

    @PostMapping
    public ResponseEntity<InscripcionDTO> inscribir (@RequestBody @Valid InscripcionRequestDTO inscripcionRequestDTO) {
        return ResponseEntity.status(201).body(inscripcionService.inscribir(inscripcionRequestDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InscripcionDTO> actulizar(@PathVariable Long id, @RequestBody @Valid InscripcionDTO inscripcionDTO) {
       return ResponseEntity.ok(inscripcionService.actualizar(id, inscripcionDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<InscripcionDTO> eliminar(@PathVariable Long id){
        inscripcionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
