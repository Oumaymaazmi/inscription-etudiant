/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.Departement;
import java.util.List;

/**
 *
 * @author Imane
 */
public interface DepartementService {
    public void  save(Departement departement);
    public List<Departement> findAll();
    public Departement findByLibelle(String libelle);


}
