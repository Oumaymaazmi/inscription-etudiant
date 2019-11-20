
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long>{
    public Etudiant findByCne(String cne);
    public void deleteByCne(String cne);
}

