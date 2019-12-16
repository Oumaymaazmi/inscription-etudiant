/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Inscription;
import com.fstg.inscription.dao.InscriptionDao;
import com.fstg.inscription.service.InscriptionService;
import java.util.ArrayList;
import java.util.Date;
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
    
    @Override
    public void save(Inscription inscription) {
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

    @Override
    public List<Inscription> findByDateInscription(Date dateInscrition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
