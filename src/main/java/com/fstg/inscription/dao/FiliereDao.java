/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.Filiere;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author momo
 */
@Repository
public interface FiliereDao extends JpaRepository<Filiere, Long> {

    public Filiere findBylibelle(String libelle);

    public List<Filiere> findByDepartementLibelle(String libelle);

}
