package com.example.rouamnissiexamnblanc.RestControllers;

import com.example.rouamnissiexamnblanc.DAO.Entities.Vol;
import com.example.rouamnissiexamnblanc.DAO.Entities.Voyageur;
import com.example.rouamnissiexamnblanc.Services.Ivoyageur;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voyageur")
@AllArgsConstructor
public class VoyageurRestController {

Ivoyageur ivoyageur;
    @PostMapping("/add")
    List<Voyageur>  add(@RequestBody List <Voyageur >v) {
        return ivoyageur.ajouterVoyageur(v);
    }
}
