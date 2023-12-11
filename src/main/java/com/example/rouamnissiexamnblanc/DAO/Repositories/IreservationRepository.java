package com.example.rouamnissiexamnblanc.DAO.Repositories;

import com.example.rouamnissiexamnblanc.DAO.Entities.ClassPlace;
import com.example.rouamnissiexamnblanc.DAO.Entities.Reservation;
import com.example.rouamnissiexamnblanc.DAO.Entities.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IreservationRepository  extends JpaRepository<Reservation, String >  {
    List <Reservation >findByClassPlace(ClassPlace classPlace);
}
