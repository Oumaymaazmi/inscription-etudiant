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


/**
 *
 * @author Imane
 */
@Entity
public class PieceFiliere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Filiere filiere;
    @ManyToOne
    private Piece piece;
    private int nombreExige;

    public Filiere getFilliere() {
        return filiere;
    }

    public void setFilliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getNombreExige() {
        return nombreExige;
    }

    public void setNombreExige(int nombreExige) {
        this.nombreExige = nombreExige;
    }

    
    public Long getId() {
        return id;
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
        if (!(object instanceof PieceFiliere)) {
            return false;
        }
        PieceFiliere other = (PieceFiliere) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fstg.inscription.bean.PieceFilliere[ id=" + id + " ]";
    }
    
 
    
    
    
    
    
}
