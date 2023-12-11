package com.example.rouamnissiexamnblanc.Services;

import com.example.rouamnissiexamnblanc.DAO.Entities.ClassPlace;
import com.example.rouamnissiexamnblanc.DAO.Entities.Reservation;

public interface IreservationService {
    String ReserverVol(int voyageurId , int VolId ,ClassPlace classPlace);
    Reservation ConfirmerReservation(String resId);

}
