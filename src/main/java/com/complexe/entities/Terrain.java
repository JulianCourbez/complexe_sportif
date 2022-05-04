package com.complexe.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Terrain
 *
 */
@Entity
@Table(name = "terrains")
public class Terrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifiant;
    private String code;
    @Enumerated(EnumType.STRING)
    @Column(length = 45)
    private Surface surface;
    @ManyToMany
    @JoinTable(name = "terrains_sports", joinColumns = @JoinColumn(name = "fk_identifiant_terrain", foreignKey = @ForeignKey(name = "fk_terrains"), nullable = false), inverseJoinColumns = @JoinColumn(name = "fk_identifiant_sport", foreignKey = @ForeignKey(name = "fk_sports"), nullable = false))
    private List<Sport> sportsAutorises;

    public Terrain() {
        super();
    }

    public Terrain(String string, Surface beton) {

    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Surface getSurface() {
        return surface;
    }

    public void setSurface(Surface surface) {
        this.surface = surface;
    }

    public List<Sport> getSportsAutorises() {
        return sportsAutorises;
    }

    public void setSportsAutorises(List<Sport> sportsAutorises) {
        this.sportsAutorises = sportsAutorises;
    }

}