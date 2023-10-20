package com.kanfory.ecole.repositories;

import com.kanfory.ecole.models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Long> {
}
