/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Inscription;
import com.fstg.inscription.service.InscriptionService;
import java.util.Date;
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
@RequestMapping("/inscription-api/inscription")
public class InscriptionRest {
     
   @Autowired
    private InscriptionService inscriptionService;
   
   @PostMapping("/")
   public void save(@RequestBody Inscription inscription){
       inscriptionService.save(inscription);
   }
   
   @GetMapping("/libelle/{libelle}")
   public List<Inscription> findByFiliere(@PathVariable String libelle){
       return inscriptionService.findByFiliereLibelle(libelle);   }
   
   @GetMapping("/dateInscription/{dateInscription}")
   public List<Inscription> findByDateInscription(@PathVariable Date dateInscription){
       return inscriptionService.findByDateInscription(dateInscription);
   }
   @GetMapping("/cne/{cne}")
   public Inscription findByEtudiant_Cne(@PathVariable String cne){
       return inscriptionService.findByEtudiantCne(cne);
   }
   
   public  List<Inscription> finAll(){
       return inscriptionService.findAll();
   }
}
