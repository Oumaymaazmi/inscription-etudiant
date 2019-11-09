/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.TypeFiliere;
import com.fstg.inscription.service.TypeFiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author momo
 */
@RestController
@RequestMapping("/inscription-api/typeFiliere")
public class TypeFiliereRest {
    
    @Autowired
    private TypeFiliereService typeFiliereService;

    @PostMapping("/")
    public void save(@RequestBody TypeFiliere typeFiliere) {
        typeFiliereService.save(typeFiliere);
    }
    @GetMapping("/libelle/{libelle}")
    public TypeFiliere findByLibelle(@PathVariable String libelle) {
        return typeFiliereService.findByLibelle(libelle);
    }
}
