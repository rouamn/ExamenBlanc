package com.example.rouamnissiexamnblanc.Services;

import com.example.rouamnissiexamnblanc.DAO.Entities.Voyageur;
import com.example.rouamnissiexamnblanc.DAO.Repositories.VoyageurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class VoyageurService implements Ivoyageur {
    @Autowired
    VoyageurRepository voyageurRepository;
    @Override
    public List<Voyageur> ajouterVoyageur(List<Voyageur> voyageurs) {
        return voyageurRepository.saveAll(voyageurs);
    }

    @Override
    public Map<Integer, List<Voyageur>> getVoyageutByVol() {
        return null;
    }
}
