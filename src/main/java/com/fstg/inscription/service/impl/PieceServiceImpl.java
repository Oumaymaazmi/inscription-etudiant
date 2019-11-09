/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Piece;
import com.fstg.inscription.dao.PieceDao;
import com.fstg.inscription.service.PieceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Imane
 */
@Service
public class PieceServiceImpl implements PieceService{
    @Autowired
    private PieceDao pieceDao;
    
    @Override
    public void save(Piece piece) {
        pieceDao.save(piece);
    }

    @Override
    public List<Piece> findAll() {
       return pieceDao.findAll();
    }

    @Override
    public Piece findByLibelle(String libelle) {
        return pieceDao.findByLibelle(libelle);
    }
    
}
