package com.example.rouamnissiexamnblanc.DAO.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "vol")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvol;


    @Column(name = "dateDepart")
    private LocalDate dateDepart;
    @Column(name = "dateArrive")
    private LocalDate dateArrive;


    @ManyToOne
    Aeroport depart;
    @ManyToOne
    Aeroport arrive;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vol")

    private Set<Reservation> reservations ;
}
