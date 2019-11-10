/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.PieceInscription;
import java.util.List;

/**
 *
 * @author momo
 */
public interface PieceInscriptionService {
    public void save(PieceInscription pieceInscription);
    public List<PieceInscription> findAll();
    
}
