package com.kanfory.ecole.controllers;

import com.kanfory.ecole.models.Etablissement;
import com.kanfory.ecole.services.EtablissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/etablissement")
public class EtablissementController {

    @Autowired
    EtablissementService etablissementService;

    @GetMapping("/hello")
    public String greeting() {
        return "hello world";
    }

    @GetMapping("/all")
    public List<Etablissement> getAll() {
        return etablissementService.getAllEtablissement();
    }
}
