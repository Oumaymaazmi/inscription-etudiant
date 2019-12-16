/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Departement;
import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.service.DepartementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hiba
 * 
 */
@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
@RequestMapping({"/inscription-api/departement"})
public class DepartementRest {

    @Autowired
    private DepartementService departementService;

    @PostMapping("/")
    public void save(@RequestBody Departement departement) {
        departementService.save(departement);
    }

    @GetMapping("/")
    public List<Departement> findAll() {
        return departementService.findAll();
    }

    @GetMapping("/libelle/{libelle}")
    public Departement findByLibelle(@PathVariable String libelle) {
        return departementService.findByLibelle(libelle);
    }

<<<<<<< HEAD
//    @GetMapping("/{departement}")
//    public List<Filiere> findByDepartement(@PathVariable String libelle) {
//        return departementService.findAllFiliere(libelle);
//    }
//    @PutMapping("/{id}")
//    public Departement edit(long id, Departement departement) {
//        return departementService.edit(id, departement);
//    }
//    
//    @PutMapping("/departement/{departement}")
//    public  Departement edit( @RequestBody Departement departement) {
//        return departementService.edit(departement);
//    }
=======
>>>>>>> branch 'master' of https://github.com/imaneEmi/-inscription-v2.git

}
