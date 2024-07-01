package com.aluracursos.screenmatch_frases.controller;

import com.aluracursos.screenmatch_frases.dto.FrasesDTO;
import com.aluracursos.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService service;
    @GetMapping("/series/frases")
    public FrasesDTO obtenerFraseAleatoria(){
        return service.obtenerFraseAleatoria();
    }
}
