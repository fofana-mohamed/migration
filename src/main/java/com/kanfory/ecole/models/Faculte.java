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
public class Faculte {

    @Id
    @GeneratedValue
    private Long faculteIdentification;
    private String prenom;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "professionIdentification")
    private Profession profession;
    private String numeroTelephone;
    private String rue;
    private String ville;
    private String prefecture;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "faculte_etablissement",
            joinColumns = @JoinColumn(name = "faculte_id"),
            inverseJoinColumns = @JoinColumn(name = "etablissementIdentification")
    )
    private List<Etablissement> etablissements;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "faculte_cours",
            joinColumns = @JoinColumn(name = "faculte_id"),
            inverseJoinColumns = @JoinColumn(name = "coursIdentification")
    )
    private List<Cours> cours;
    private Date dateNaissance;

    public Faculte() {}

    public Faculte(String prenom, String nom, Profession profession, String numeroTelephone, String rue, String ville, String prefecture, List<Etablissement> etablissements, List<Cours> cours, Date dateNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.profession = profession;
        this.numeroTelephone = numeroTelephone;
        this.rue = rue;
        this.ville = ville;
        this.prefecture = prefecture;
        this.etablissements = etablissements;
        this.cours = cours;
        this.dateNaissance = dateNaissance;
    }
}
