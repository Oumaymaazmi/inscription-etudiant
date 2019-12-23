/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.InscriptionConfiguration;
import java.util.Date;
import java.util.List;

/**
 *
 * @author momo
 */
public interface InscriptionConfigurationService {
    public InscriptionConfiguration findByFiliere(String filiere);
    public List<InscriptionConfiguration> findByDateDebut(Date dateDebut);
    public List<InscriptionConfiguration> findByDateFin(Date dateFin);
    public List<InscriptionConfiguration> findAll();
    public void save(InscriptionConfiguration inscriptionConfiguration);
    
}
