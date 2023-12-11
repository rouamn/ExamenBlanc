package com.example.rouamnissiexamnblanc.Services;

import com.example.rouamnissiexamnblanc.DAO.Entities.*;
import com.example.rouamnissiexamnblanc.DAO.Repositories.IreservationRepository;
import com.example.rouamnissiexamnblanc.DAO.Repositories.VolRepository;
import com.example.rouamnissiexamnblanc.DAO.Repositories.VoyageurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationService  implements IreservationService{
    IreservationRepository ireservationRepository;
    VolRepository volRepository;
    VoyageurRepository voyageurRepository;
    @Override
    public String ReserverVol(int voyageurId, int VolId, ClassPlace classPlace) {
        Optional<Voyageur> u = voyageurRepository.findById(voyageurId);
        Optional<Vol> v = volRepository.findById(VolId);
        List<Reservation> r = ireservationRepository.findByClassPlace(classPlace);



        voyageurRepository.findAll();


        return null;
    }

    @Override
    public Reservation ConfirmerReservation(String resId) {
        Reservation r =ireservationRepository.findById(resId).get();
        r.setEtatReservation((EtatReservation.CONFIRMEE));
        return  r;
    }
}
