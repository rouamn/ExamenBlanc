package com.example.rouamnissiexamnblanc.Services;

import com.example.rouamnissiexamnblanc.DAO.Entities.Voyageur;

import java.util.List;
import java.util.Map;

public interface Ivoyageur {
    List<Voyageur> ajouterVoyageur(List<Voyageur> voyageurs);
    Map<Integer,List<Voyageur>> getVoyageutByVol();
}
