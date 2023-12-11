package com.example.rouamnissiexamnblanc.RestControllers;

import com.example.rouamnissiexamnblanc.DAO.Entities.Vol;
import com.example.rouamnissiexamnblanc.Services.IvolService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vol")
@AllArgsConstructor
public class VolRestControllers {

    IvolService ivolService;

    @PostMapping("/add")
    String  add(@RequestBody Vol v) {
        return ivolService.ajouterVolEtAeroport(v);
    }
}
