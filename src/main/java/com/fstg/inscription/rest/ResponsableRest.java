/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Responsable;
import com.fstg.inscription.service.ResponsableService;

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
@RequestMapping("/inscription-api/responsable")
public class ResponsableRest {
    
    @Autowired
    private ResponsableService responsableService;
    
    @PostMapping("/")
    public void save(@RequestBody Responsable responsable){
        responsableService.save(responsable);
    }
    
    @GetMapping("/")
    public List<Responsable> findAll(){
        return responsableService.findAll();
    }
}
