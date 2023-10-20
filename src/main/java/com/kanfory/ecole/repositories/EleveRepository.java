package com.kanfory.ecole.repositories;

import com.kanfory.ecole.models.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleveRepository extends JpaRepository<Eleve, Long> {
}
