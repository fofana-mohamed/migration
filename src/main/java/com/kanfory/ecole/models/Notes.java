package com.kanfory.ecole.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Notes {

    @Id
    @GeneratedValue
    private Long NoteIdentification;
    private Integer note;
    @OneToOne
    private Cours cours;
    @OneToOne
    private Eleve eleve;

    public Notes() {}
}
