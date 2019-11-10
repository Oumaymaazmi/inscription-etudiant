/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Responsable;
import com.fstg.inscription.dao.ResponsableDao;
import com.fstg.inscription.service.ResponsableService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author momo
 */
public class ResponsableServiceImpl  implements ResponsableService{
    @Autowired
    private ResponsableDao responsableDao;

    @Override
    public void save(Responsable responsable) {
         responsableDao.save(responsable);
    }

    @Override
    public List<Responsable> findAll() {
         return responsableDao.findAll();
    }

    @Override
    public Responsable findByCni(String cni) {
           return responsableDao.findByCni(cni);
    }
    
}
