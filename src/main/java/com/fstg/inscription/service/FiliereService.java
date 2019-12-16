/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import java.util.List;

import com.fstg.inscription.bean.Departement;
import com.fstg.inscription.bean.Filiere;



/**
 *
 * @author hiba
 */
public interface FiliereService {
    public void save(Filiere filiere);
    public List<Filiere> findAll();
    public Filiere findBylibelle(String libelle);
    public List<Filiere> findByDepartementLibelle(String libelle);
   // public Filiere edit(long id,Filiere filiere);
    
    
}
