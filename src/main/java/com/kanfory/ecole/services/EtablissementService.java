package com.kanfory.ecole.services;

import com.kanfory.ecole.models.Etablissement;
import com.kanfory.ecole.repositories.EtablissementRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EtablissementService {

    @Autowired
    EtablissementRepository etablissementRepository;

    public List<Etablissement> getAllEtablissement() {
        return etablissementRepository.findAll();
    }
}
