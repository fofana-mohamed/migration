package com.kanfory.ecole.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Cours {

    @Id
    @GeneratedValue
    private Long coursIdentification;
    private String nom;
    @ManyToMany(mappedBy = "cours")
    private List<Faculte> faculte;
    @ManyToOne
    private Etablissement etablissement;
    @ManyToMany(mappedBy = "cours")
    private List<Eleve> eleve;
    private Integer capacite;

    public Cours() {}
}
