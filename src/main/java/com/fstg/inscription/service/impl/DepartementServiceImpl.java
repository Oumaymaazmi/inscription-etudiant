/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Departement;
import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.dao.DepartementDao;
import com.fstg.inscription.service.DepartementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Imane
 */
@Service
public class DepartementServiceImpl implements DepartementService {

    @Autowired
    private DepartementDao departementDao;

    @Override
    public Departement findByLibelle(String libelle) {
        return departementDao.findByLibelle(libelle);
    }

    @Override
    public void save(Departement departement) {
        departementDao.save(departement);
    }

    @Override
    public List<Departement> findAll() {
        return departementDao.findAll();
    }

   
   

}
