/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.PieceInscription;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author momo
 */
public interface PieceInscriptionDao extends JpaRepository<PieceInscription, Long>{
    
    
}
