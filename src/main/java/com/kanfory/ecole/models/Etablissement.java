package com.kanfory.ecole.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Etablissement {

    @Id
    @GeneratedValue
    private Long etablissementIdentification;
    private String nom;
    private String rue;
    private String ville;
    private String prefecture;
    private String code_postale;
    @JsonIgnore
    @ManyToMany(mappedBy = "etablissements")
    private List<Faculte> faculte;

    public Etablissement() {}

    public Etablissement(String nom, String rue, String ville, String prefecture, String code_postale, List<Faculte> faculte) {
        this.nom = nom;
        this.rue = rue;
        this.ville = ville;
        this.prefecture = prefecture;
        this.code_postale = code_postale;
        this.faculte = faculte;
    }
}
