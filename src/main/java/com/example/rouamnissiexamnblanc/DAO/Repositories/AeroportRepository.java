package com.example.rouamnissiexamnblanc.DAO.Repositories;

import com.example.rouamnissiexamnblanc.DAO.Entities.Aeroport;
import com.example.rouamnissiexamnblanc.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportRepository   extends JpaRepository<Aeroport,Integer >  {
}
