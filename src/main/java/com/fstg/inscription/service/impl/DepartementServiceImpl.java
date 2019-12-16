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
    
//    @Override
//    public Departement edit(Departement departement) {
//        
//        return departementDao.edit(departement);
//    }

<<<<<<< HEAD

//    @Override
//    public List<Filiere> findAllFiliere(String libDepartement) {
//        Departement myDepartement = departementDao.findByLibelle(libDepartement);
//        return myDepartement.getFiliere();
//
//    }

//    @Override
//    public Departement edit(long id, Departement departement) {
//        Departement myDepartement = departementDao.findById(id).get();
//        departement.setId(id);
//        departementDao.save(departement);
//        return departement;
//    }

//    @Override
//    public boolean existFiliere(Departement departement, String libelle) {
//        List<Filiere> filieres = departementDao.findByDepartementLibelle(departement.getLibelle());
//        for (int i = 0; i < filieres.size(); i++) {
//            if (filieres.get(i).getLibelle().equals(libelle)) {
//                return true;
//            }
//        }
//        return false;
//
//    }
=======
   
>>>>>>> branch 'master' of https://github.com/imaneEmi/-inscription-v2.git
}
