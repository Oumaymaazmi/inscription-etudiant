/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.InscriptionConfiguration;
import com.fstg.inscription.dao.InscriptionConfigurationDao;
import com.fstg.inscription.service.InscriptionConfigurationService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author momo
 */
@Service
public class InscriptionConfigurationServiceImpl  implements InscriptionConfigurationService{
    @Autowired
    private InscriptionConfigurationDao inscriptionConfihurationDao;

    @Override
    public InscriptionConfiguration findByFiliere(String filiere) {
      return inscriptionConfihurationDao.findByFiliere(filiere);
    }

    @Override
    public List<InscriptionConfiguration> findByDateDebut(Date dateDebut) {
   return inscriptionConfihurationDao.findByDateDebut(dateDebut);
    }

    @Override
    public List<InscriptionConfiguration> findByDateFin(Date dateFin) {
      return inscriptionConfihurationDao.findByDateFin(dateFin);
    }

    @Override
    public List<InscriptionConfiguration> findAll() {
    return inscriptionConfihurationDao.findAll();
    }

    @Override
    public void save(InscriptionConfiguration inscriptionConfiguration) {
         inscriptionConfihurationDao.save(inscriptionConfiguration);
    }
    
    
}
