package com.example.rouamnissiexamnblanc.DAO.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "reservation")
public class Reservation {
    @Id

    private String idreservation;


    @Column(name = "dateReservation")
    private LocalDate dateReservation;

    @Enumerated(EnumType.STRING)
    private  ClassPlace classPlace ;
    @Enumerated(EnumType.STRING)
    private EtatReservation  etatReservation;
    @ManyToOne
    Vol vol;


    @ManyToOne
    Voyageur voyageur;


}
