package com.kanfory.ecole.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Type {

    @Id
    @GeneratedValue
    private Long typeIdentification;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "etablissementIdentification")
    private Etablissement etablissement;

    public Type() {}
}
