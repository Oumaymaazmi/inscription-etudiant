/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.dao.DepartementDao;
import com.fstg.inscription.dao.FiliereDao;
import com.fstg.inscription.service.FiliereService;

/**
 *
 * @author momo
 */
@Service
public class FiliereServiceImpl implements FiliereService {

    @Autowired
    private FiliereDao filiereDao;
    @Autowired
    private DepartementDao departementDao;

    @Override
    public void save(Filiere filiere) {
        filiereDao.save(filiere);

    }

    @Override
    public Filiere findBylibelle(String libelle) {
        return filiereDao.findBylibelle(libelle);
    }

    @Override
    public java.util.List<Filiere> findByDepartementLibelle(String libelle) {
        //return filiereDao.findByDepartementLibelle(libelle);
        return null;
    }

    @Override
    public java.util.List<Filiere> findAll() {

        return filiereDao.findAll();
    }

//	@Override
//	public Filiere edit(long id, Filiere filiere) {
//		
//		return filiereDao.Filiere edit(long id,Filiere filiere);;
//	}
}
