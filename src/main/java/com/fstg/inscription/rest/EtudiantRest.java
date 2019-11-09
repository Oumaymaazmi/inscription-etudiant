/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Etudiant;
import com.fstg.inscription.service.EtudiantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("/inscription-api/etudiant")
public class EtudiantRest {
    @Autowired
    private EtudiantService etudiantService;

    @PostMapping("/")
    public void save(@RequestBody Etudiant etudiant) {
        etudiantService.save(etudiant);
    }

    @GetMapping("/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }
    @DeleteMapping("/")
    public void deleteByCne(String cne) {
        etudiantService.deleteByCne(cne);
    }

    @GetMapping("/cne/{cne}")
    public Etudiant findByCne(@PathVariable String cne) {
        return etudiantService.findByCne(cne);
    }
}
