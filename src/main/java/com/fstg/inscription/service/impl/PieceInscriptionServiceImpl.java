/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;


import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.bean.PieceInscription;
import com.fstg.inscription.dao.PieceInscriptionDao;

import com.fstg.inscription.service.PieceInscriptionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author momo
 */
@Service
public class PieceInscriptionServiceImpl implements PieceInscriptionService{
   @Autowired
   private PieceInscriptionDao pieceInscriptionDao;

    @Override
    public void save(PieceInscription pieceInscription) {
      pieceInscriptionDao.save(pieceInscription);
    }

    @Override
    public List<PieceInscription> findAll() {
          return pieceInscriptionDao.findAll();
    }
    
  
   
    
}
