/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.Departement;
import com.fstg.inscription.bean.Filiere;
import java.util.List;

/**
 *
 * @author Imane
 */
public interface DepartementService {
    public void  save(Departement departement);
    public List<Departement> findAll();
    public Departement findByLibelle(String libelle);
    public List<Filiere> findAllFiliere(String libelle); //sitez tous les filiere dan le departement
    public Departement edit(long id,Departement departement); //add depertement
   

}
