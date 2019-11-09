/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.Piece;
import java.util.List;

/**
 *
 * @author Imane
 */
public interface PieceService {
    public void save(Piece piece);
    public List<Piece> findAll();
    public Piece findByLibelle(String libelle);
}
