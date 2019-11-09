/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.TypeFiliere;
import com.fstg.inscription.dao.TypeFiliereDao;
import com.fstg.inscription.service.TypeFiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author momo
 */
@Service
public class TypeFiliereServiceImpl implements TypeFiliereService {

    @Autowired
    private TypeFiliereDao typeFiliereDao;

    @Override
    public void save(TypeFiliere typeFiliere) {
        typeFiliereDao.save(typeFiliere);
    }

    @Override
    public TypeFiliere findByLibelle(String libelle) {
        return typeFiliereDao.findByLibelle(libelle);
    }

}
