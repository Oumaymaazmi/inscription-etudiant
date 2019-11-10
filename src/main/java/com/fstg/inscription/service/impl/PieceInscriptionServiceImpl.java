/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.bean.PieceFiliere;
import com.fstg.inscription.dao.PieceInscriptionDao;
import com.fstg.inscription.service.PieceFiliereService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author momo
 */
@Service
public class PieceInscriptionServiceImpl implements PieceFiliereService{
   @Autowired
   private PieceInscriptionDao pieceInscriptionDao;
    
    
    @Override
    public void save(PieceFiliere pieceFiliere) {
           pieceInscriptionDao.save(pieceFiliere);
    }

    @Override
    public List<PieceFiliere> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PieceFiliere> findByFilier(Filiere filiere) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
