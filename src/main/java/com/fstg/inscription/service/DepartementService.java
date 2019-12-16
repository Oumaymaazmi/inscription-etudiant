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
<<<<<<< HEAD
   // public Departement edit(Departement departement);
//    public boolean existFiliere(Departement departement ,String libFiliere); // si tel filiere exsite sur ce depertament
   // public List<Filiere> findAllFiliere(String libDepartement); //listez tous les filiere dans le departement
    //add depertement
=======

>>>>>>> branch 'master' of https://github.com/imaneEmi/-inscription-v2.git
   

}
