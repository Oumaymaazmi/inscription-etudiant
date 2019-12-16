/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.Inscription;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Imane
 */
public interface InscriptionService {
    public void save(Inscription inscription);
    public List<Inscription> findByDateInscription(Date dateInscrition);
    public List<Inscription> findByFiliereLibelle(String libelle);
     public List<Inscription> findByEtudiantCne(String cne);

    public List<Inscription> findAll();
   
    
}
