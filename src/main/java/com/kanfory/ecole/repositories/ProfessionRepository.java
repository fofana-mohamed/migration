package com.kanfory.ecole.repositories;

import com.kanfory.ecole.models.Profession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionRepository extends JpaRepository<Profession, Long> {
}
