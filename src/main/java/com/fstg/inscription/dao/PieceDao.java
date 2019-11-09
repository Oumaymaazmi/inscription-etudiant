/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Imane
 */
@Repository
public interface PieceDao extends JpaRepository<Piece, Long> {
    public Piece findByLibelle(String libelle);
}
