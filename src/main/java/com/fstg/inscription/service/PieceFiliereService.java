/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.PieceFiliere;
import java.util.List;

/**
 *
 * @author Imane
 */
public interface PieceFiliereService {
    public void save(PieceFiliere pieceFiliere);
    public List<PieceFiliere> findAll();
}
