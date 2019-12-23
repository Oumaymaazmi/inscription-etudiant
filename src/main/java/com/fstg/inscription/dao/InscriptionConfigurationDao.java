/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.InscriptionConfiguration;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
;
/**
 *
 * @author momo
 */
@Repository
public interface InscriptionConfigurationDao extends JpaRepository<InscriptionConfiguration, Long>{
    public InscriptionConfiguration findByFiliere(String filiere);
    public List<InscriptionConfiguration> findByDateDebut(Date dateDebut);
    public List<InscriptionConfiguration> findByDateFin(Date dateFin);

    
}
