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
public class Parent {

    @Id
    @GeneratedValue
    private Long parentIdentification;
    private String prenom;
    private String nom;
    private String contacteTelephone;
    @OneToOne
    private Eleve eleve;

    public Parent() {}
}
