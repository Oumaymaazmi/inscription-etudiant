/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author momo
 */
@Repository
public interface ResponsableDao  extends JpaRepository<Responsable, Long>{
        public Responsable findByCni(String cni);
        public Responsable findByNom(String nom);

}
  