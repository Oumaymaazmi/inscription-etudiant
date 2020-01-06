/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Inscription;
import com.fstg.inscription.dao.FiliereDao;
import com.fstg.inscription.dao.InscriptionDao;
import com.fstg.inscription.service.EtudiantService;
import com.fstg.inscription.service.FiliereService;
import com.fstg.inscription.service.InscriptionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Imane
 */

@Service
public class InscriptionServiceImpl implements InscriptionService{

    @Autowired
    private  InscriptionDao inscriptionDao;
    @Autowired
    private EtudiantService etudiantService;
    @Autowired
    private FiliereService filiereService;
    
    @Override
    public void save(Inscription inscription) {
        inscription.setEtudiant(etudiantService.findByCne(inscription.getEtudiant().getCne()));
        inscription.setFiliere( filiereService.findBylibelle(inscription.getFiliere().getLibelle()));        
        inscriptionDao.save(inscription);
    }
    
  

    @Override
    public List<Inscription> findByFiliereLibelle(String libelle) {
        return inscriptionDao.findByFiliereLibelle(libelle);
    }

    
    @Override
    public List<Inscription> findByEtudiantCne(String cne) {
         return inscriptionDao.findByEtudiantCne(cne);
    }

    @Override
    public List<Inscription> findAll() {
        return inscriptionDao.findAll();
    }

   // @Override
   // public List<Inscription> findByDateInscription(Date dateInscrition) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    
    
}
