/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.bean.PieceFiliere;
import com.fstg.inscription.dao.PieceFiliereDao;
import com.fstg.inscription.service.PieceFiliereService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Imane
 */
@Service
public class PieceFiliereServiceImpl implements PieceFiliereService{
    @Autowired
    private PieceFiliereDao pieceFiliereDao;
    
    @Override
    public void save(PieceFiliere pieceFiliere) {
        pieceFiliereDao.save(pieceFiliere);
    }

    @Override
    public List<PieceFiliere> findAll() {
       return pieceFiliereDao.findAll();
    }

    @Override
    public List<PieceFiliere> findByFilier(Filiere filiere) {
         return pieceFiliereDao.findByFiliere(filiere);
    }

    
    
}
