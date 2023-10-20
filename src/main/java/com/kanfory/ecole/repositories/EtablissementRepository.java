package com.kanfory.ecole.repositories;

import com.kanfory.ecole.models.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
}
