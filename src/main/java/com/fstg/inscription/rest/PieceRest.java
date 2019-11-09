/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Piece;
import com.fstg.inscription.service.PieceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Imane
 */
@RestController
@RequestMapping("/inscription-api/piece") // pour dire : acceder a cette classe par ce lien
public class PieceRest {
    @Autowired
    private PieceService pieceService ;
@PostMapping("/")
    public void save(@RequestBody Piece piece) {
        pieceService.save(piece);
    }
@GetMapping("/")
    public List<Piece> findAll() {
        return pieceService.findAll();
    }
    @GetMapping("/libelle/{libelle}")
    public Piece findByLibelle(@PathVariable String libelle) {
        return pieceService.findByLibelle(libelle);
    }
}
