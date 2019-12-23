/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.InscriptionConfiguration;
import com.fstg.inscription.service.InscriptionConfigurationService;
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
 * @author momo
 */
@RestController
@RequestMapping("/inscription-api/inscriptionConfiguration")
public class InscriptionConfigurationRest {
    @Autowired
    private InscriptionConfigurationService inscriptionConfigurationService;
    
    @GetMapping("/filiere/{filiere}")
    public InscriptionConfiguration findByFiliere(@RequestBody String filiere) {
        return inscriptionConfigurationService.findByFiliere(filiere);
    }
    @GetMapping("/dateDebut/{dateDebut}")
    public List<InscriptionConfiguration> findByDateDebut(@PathVariable Date dateDebut) {
        return inscriptionConfigurationService.findByDateDebut(dateDebut);
    }
    @GetMapping("/dateFin/{dateFin}")
    public List<InscriptionConfiguration> findByDateFin(@PathVariable Date dateFin) {
        return inscriptionConfigurationService.findByDateFin(dateFin);
    }
    @GetMapping("/")
    public List<InscriptionConfiguration> findAll() {
        return inscriptionConfigurationService.findAll();
    }
    @PostMapping("/")
    public void save(@RequestBody InscriptionConfiguration inscriptionConfiguration) {
        inscriptionConfigurationService.save(inscriptionConfiguration);
    }
    
    
    
}
