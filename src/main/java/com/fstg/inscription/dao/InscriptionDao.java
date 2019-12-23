/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.Inscription;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Imane
 */
@Repository
public interface InscriptionDao extends JpaRepository<Inscription, Long>{
   // @Query("select i from InscriptionConfiguration i  where  dateDébut <=?1  and dateFin >=?1")
   // public List<Inscription> findByDateInscription( Date dateInscrition);  //native=true requete sql 
    public List<Inscription> findByEtudiantCne(String cne);
    public List<Inscription> findByFiliereLibelle(String libelle);
}
