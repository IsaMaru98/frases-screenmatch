package com.aluracursos.screenmatch_frases.service;

import com.aluracursos.screenmatch_frases.dto.FrasesDTO;
import com.aluracursos.screenmatch_frases.model.Frases;
import com.aluracursos.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    FraseRepository repository;
    public FrasesDTO obtenerFraseAleatoria() {
        Frases frase = repository.obtenerFraseAleatoria();
        return new FrasesDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
