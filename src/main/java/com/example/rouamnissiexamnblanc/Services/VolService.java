package com.example.rouamnissiexamnblanc.Services;

import com.example.rouamnissiexamnblanc.DAO.Entities.Vol;
import com.example.rouamnissiexamnblanc.DAO.Repositories.AeroportRepository;
import com.example.rouamnissiexamnblanc.DAO.Repositories.VolRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VolService implements  IvolService {
    @Autowired
    VolRepository volRepository;
    @Autowired
    AeroportRepository aeroportRepository;
    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        try {

            volRepository.save(vol);
            return "succes";

        } catch (Exception exception) {
            return "Error";
        }

    }}
