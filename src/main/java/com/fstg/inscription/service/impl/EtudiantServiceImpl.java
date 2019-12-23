/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Etudiant;
import com.fstg.inscription.dao.EtudiantDao;
import com.fstg.inscription.service.EtudiantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Imane
 */
@Service
public class EtudiantServiceImpl implements EtudiantService {

    @Autowired
    private EtudiantDao etudiantDao;

    

    @Override
    public void save(Etudiant etudiant) {
        etudiantDao.save(etudiant);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantDao.findAll();
    }

    @Override
    public Etudiant findByCne(String cne) {
        return etudiantDao.findByCne(cne);
    }
    
    

}
