package com.complexe.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sport
 *
 */
@Entity
@Table(name = "sports")
public class Sport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifiant;
    private int nombreJoueurs;
    @Column(length = 255, nullable = false)
    private String nom;

    @ManyToMany(mappedBy = "sportsAutorises")
    private List<Terrain> terrainsCompatibles;

    public Sport() {
        super();
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getNombreJoueurs() {
        return nombreJoueurs;
    }

    public void setNombreJoueurs(int nombreJoueurs) {
        this.nombreJoueurs = nombreJoueurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Terrain> getTerrainsCompatibles() {
        return terrainsCompatibles;
    }

    public void setTerrainsCompatibles(List<Terrain> terrainsCompatibles) {
        this.terrainsCompatibles = terrainsCompatibles;
    }

}