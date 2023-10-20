package com.kanfory.ecole.repositories;

import com.kanfory.ecole.models.Faculte;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaculteRepository extends JpaRepository<Faculte, Long> {

    @Query(value = "SELECT * FROM FACULTE WHERE FACULTE_IDENTIFICATION IN (SELECT FACULTE_ID FROM FACULTE_ETABLISSEMENT WHERE ETABLISSEMENT_IDENTIFICATION = :etablissementId)",
            nativeQuery = true)
    List<Faculte> getAllFacultesByEtablissement(@Param("etablissementId") Long etablissementId);
}
