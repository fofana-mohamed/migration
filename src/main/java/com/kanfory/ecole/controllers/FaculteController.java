package com.kanfory.ecole.controllers;

import com.kanfory.ecole.models.Faculte;
import com.kanfory.ecole.services.FaculteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faculte")
public class FaculteController {

    @Autowired
    FaculteService faculteService;

    @GetMapping("/etablissement/{id}")
    public List<Faculte> getFacultesByEtablissement(@PathVariable("id") Long id) {
        return faculteService.getAllFacultesByEtablissement(id);
    }

    @GetMapping("/all")
    public List<Faculte> getAllFacultes() {
        return faculteService.getAllFacultes();
    }
}
