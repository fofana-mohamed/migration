package com.kanfory.ecole.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Eleve {

    @Id
    @GeneratedValue
    private Long eleveIdentification;
    private String prenom;
    private String nom;
    private Date dateNaissance;
    private int classe;
    private String numeroTelephone;
    private String rue;
    private String ville;
    private String prefecture;
    @OneToMany
    private List<Etablissement> etablissements;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "eleve_cours",
            joinColumns = @JoinColumn(name = "eleve_id"),
            inverseJoinColumns = @JoinColumn(name = "coursIdentification")
    )
    private List<Cours> cours;

    public Eleve() {}
}
