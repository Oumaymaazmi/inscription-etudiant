/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Imane
 */
@Entity
public class Filiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    @OneToOne
    private Responsable responsable;
    @ManyToOne
    private Departement departement;
    @ManyToOne
    private TypeFiliere typeFiliere;
    @OneToMany(mappedBy = "filiere")
    private List<Inscription> inscription;
     @OneToMany(mappedBy = "filiere")
    private List<PieceFiliere> pieceFiliere;

    public List<Inscription> getInscription() {
        return inscription;
    }

    public void setInscription(List<Inscription> inscription) {
        this.inscription = inscription;
    }

    public Long getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public TypeFiliere getTypeFiliere() {
        return typeFiliere;
    }

    public void setTypeFiliere(TypeFiliere typeFiliere) {
        this.typeFiliere = typeFiliere;
    }

 

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiere)) {
            return false;
        }
        Filiere other = (Filiere) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fstg.inscription.bean.Filiere[ id=" + id + " ]";
    }
    
}
