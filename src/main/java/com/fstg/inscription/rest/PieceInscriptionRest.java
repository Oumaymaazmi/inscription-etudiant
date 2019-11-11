/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.PieceInscription;
import com.fstg.inscription.service.PieceInscriptionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author momo
 */
@RestController
@RequestMapping("/inscription-api/pieceInscription")
public class PieceInscriptionRest {
    @Autowired
    private PieceInscriptionService pieceInscriptionService;
     @PostMapping("/")
    public void save( @RequestBody PieceInscription pieceInscription) {
        pieceInscriptionService.save(pieceInscription);
    }
     
    @GetMapping("/")
    public List<PieceInscription> findAll() {
        return pieceInscriptionService.findAll();
    }
    
    
    
}
