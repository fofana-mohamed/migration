package com.kanfory.ecole.services;

import com.kanfory.ecole.models.Faculte;
import com.kanfory.ecole.repositories.FaculteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FaculteService {

    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    FaculteRepository faculteRepository;

    public void inserIntoEtablissementFaculteRelationshipTable(Long etablissementId, Long faculteId) {
        String sql = "INSERT INTO FACULTE_ETABLISSEMENT (ETABLISSEMENT_IDENTIFICATION, FACULTE_ID) VALUES (:etablissementId, :faculteId)";
        entityManager.createNativeQuery(sql)
                .setParameter("etablissementId", etablissementId)
                .setParameter("faculteId", faculteId)
                .executeUpdate();
//        entityManager.getTransaction().commit();
    }

    public List<Faculte> getAllFacultesByEtablissement(Long etablissementId) {
//        String sql = "SELECT * FROM FACULTE WHERE IN (SELECT FACULTE_ID FROM FACULTE_ETABLISSEMENT WHERE ETABLISSEMENT_IDENTIFICATION = :etablissementId)";
//        entityManager.createNativeQuery(sql)
//                .setParameter("etablissementId", etablissementId);
        return faculteRepository.getAllFacultesByEtablissement(etablissementId);
    }

    public List<Faculte> getAllFacultes() {
        return faculteRepository.findAll();
    }
}
