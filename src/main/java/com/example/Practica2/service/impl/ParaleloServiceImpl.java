package com.example.Practica2.service.impl;

import com.example.Practica2.dto.ParaleloDTO;
import com.example.Practica2.model.Docente;
import com.example.Practica2.model.Materia;
import com.example.Practica2.model.Paralelo;
import com.example.Practica2.repository.DocenteRepository;
import com.example.Practica2.repository.MateriaRepository;
import com.example.Practica2.repository.ParaleloRepository;
import com.example.Practica2.service.ParaleloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParaleloServiceImpl implements ParaleloService {

    private final ParaleloRepository paraleloRepository;
    private final MateriaRepository materiaRepository;
    private final DocenteRepository docenteRepository;


    public ParaleloDTO convertirADTO(Paralelo paralelo, Materia materia, Docente docente){
        return ParaleloDTO.builder()
                .id_paralelo(paralelo.getId_paralelo())
                .grupo(paralelo.getGrupo())
                .horario(paralelo.getHorario())
                .dias(paralelo.getDias())
                .aula(paralelo.getAula())
                .nombreMateria(materia.getNombre())
                .Docente(docente.getCi())
                .build();
    }

    @Override
    public ParaleloDTO crear (ParaleloDTO dto){
        Materia materia = materiaRepository.findByNombre(dto.getNombreMateria());
        if (materia == null) {
            throw new RuntimeException("Materia no encontrada: " + dto.getNombreMateria());
        }

        Docente docente = docenteRepository.findByCi(dto.getDocente());
        if (docente == null) {
            throw new RuntimeException("Docente no encontrado con CI: " + dto.getDocente());
        }

        Paralelo paralelo = Paralelo.builder()
                .grupo(dto.getGrupo())
                .horario(dto.getHorario())
                .dias(dto.getDias())
                .aula(dto.getAula())
                .materia(materia)
                .docente(docente)
                .build();

        paraleloRepository.save(paralelo);

        return convertirADTO(paralelo, materia, docente);
    }

    @Override
    public List<ParaleloDTO> listar(){
        return paraleloRepository.findAll().stream()
                .map(paralelo -> convertirADTO(
                        paralelo,
                        paralelo.getMateria(),
                        paralelo.getDocente()
                ))
                .toList();
    }
}
