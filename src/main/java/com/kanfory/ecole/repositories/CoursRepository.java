package com.kanfory.ecole.repositories;

import com.kanfory.ecole.models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
