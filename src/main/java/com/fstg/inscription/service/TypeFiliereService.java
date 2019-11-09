/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.TypeFiliere;

/**
 *
 * @author momo
 */
public interface TypeFiliereService {

    public void save(TypeFiliere typeFiliere);

    public TypeFiliere findByLibelle(String libelle);

}
