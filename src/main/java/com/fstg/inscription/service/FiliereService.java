/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.bean.PieceFiliere;
import java.util.List;

/**
 *
 * @author momo
 */
public interface FiliereService {
    public void save(Filiere filiere);
    public Filiere findBylibelle(String libelle);


    
}
