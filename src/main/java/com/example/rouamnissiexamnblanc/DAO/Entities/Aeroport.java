package com.example.rouamnissiexamnblanc.DAO.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "aeroport")
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAeroport;


    @Column(name = "nom")
    private String nom;

    @Column(name = "codeAITA")
    private String codeAITA;
    @Column(name = "Telephone")
    private long  Telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="depart")
   private  Set<Vol> volDepart ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="arrive")
    private  Set<Vol> volArrive ;







}
