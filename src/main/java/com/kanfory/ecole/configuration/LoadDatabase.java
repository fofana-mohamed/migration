package com.kanfory.ecole.configuration;

import com.kanfory.ecole.models.Cours;
import com.kanfory.ecole.models.Etablissement;
import com.kanfory.ecole.models.Faculte;
import com.kanfory.ecole.models.Profession;
import com.kanfory.ecole.repositories.EtablissementRepository;
import com.kanfory.ecole.repositories.FaculteRepository;
import com.kanfory.ecole.services.FaculteService;
import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(
            EtablissementRepository etablissementRepository,
            FaculteRepository faculteRepository,
            FaculteService faculteService
    ) {
        return args -> {
          // Etablissements
            Etablissement savedEtablissement = etablissementRepository.save(new Etablissement("Lycee 2 Octobre", "Rue Fidel Castro", "Conakry", null, "00000",null));
            Etablissement savedEtablissement2 = etablissementRepository.save(new Etablissement("Lycee St George", "Rue Camayenne", "Conakry", null, "00000",null));

            // Faculte
            Faculte savedFaculte = faculteRepository.saveAndFlush(new Faculte("Mohamed", "Fofana", null, "+22465125689", "Rue Fofanaya", "Conakry", null, null, null, new Date()));
            Faculte savedFaculte2 = faculteRepository.saveAndFlush(new Faculte("Mariam", "Fofana", null, "+22465125689", "Rue Fofanaya", "Conakry", null, null, null, new Date()));
            Faculte savedFaculte3 = faculteRepository.saveAndFlush(new Faculte("Kadiatou", "Fofana", null, "+22465125689", "Rue Fofanaya", "Conakry", null, null, null, new Date()));
            Faculte savedFaculte4 = faculteRepository.saveAndFlush(new Faculte("Fatoumata", "Camara", null, "+22465125689", "Rue Fofanaya", "Conakry", null, null, null, new Date()));

            faculteService.inserIntoEtablissementFaculteRelationshipTable(savedEtablissement.getEtablissementIdentification(), savedFaculte.getFaculteIdentification());
            faculteService.inserIntoEtablissementFaculteRelationshipTable(savedEtablissement2.getEtablissementIdentification(), savedFaculte2.getFaculteIdentification());
            faculteService.inserIntoEtablissementFaculteRelationshipTable(savedEtablissement2.getEtablissementIdentification(), savedFaculte3.getFaculteIdentification());
            faculteService.inserIntoEtablissementFaculteRelationshipTable(savedEtablissement2.getEtablissementIdentification(), savedFaculte4.getFaculteIdentification());
        };
    }
}
