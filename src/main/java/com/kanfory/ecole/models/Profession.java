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
public class Profession {

    @Id
    @GeneratedValue
    private Long professionIdentification;
    private String nom;
    @OneToMany(mappedBy = "profession", cascade = CascadeType.ALL)
    private List<Faculte> facultes;
    public Profession() {}

    public Profession(String nom, List<Faculte> facultes) {
        this.nom = nom;
        this.facultes = facultes;
    }
}
