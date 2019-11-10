/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.Responsable;
import java.util.List;

/**
 *
 * @author momo
 */
public interface ResponsableService {
    public void save(Responsable responsable);
    public List<Responsable> findAll();
    public Responsable findByCni(String cni);
    
}
