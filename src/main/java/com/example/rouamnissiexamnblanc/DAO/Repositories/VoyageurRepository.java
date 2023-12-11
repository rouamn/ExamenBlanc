package com.example.rouamnissiexamnblanc.DAO.Repositories;

import com.example.rouamnissiexamnblanc.DAO.Entities.Vol;
import com.example.rouamnissiexamnblanc.DAO.Entities.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoyageurRepository   extends JpaRepository<Voyageur, Integer > {
}
