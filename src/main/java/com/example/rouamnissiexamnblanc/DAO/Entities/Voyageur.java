package com.example.rouamnissiexamnblanc.DAO.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "voyageur")
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvoyageur;


    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;
    @Column(name = "dateNaissance")
    private Date dateNaissance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="voyageur")
    private Set<Reservation> reservations;

}
