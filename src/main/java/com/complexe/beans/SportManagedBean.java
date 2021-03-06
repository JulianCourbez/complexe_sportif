package com.complexe.beans;

import com.complexe.entities.Sport;
import com.complexe.entities.Surface;
import com.complexe.entities.Terrain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name="sportMB")
@RequestScoped
public class SportManagedBean implements Serializable
{

    private static final long serialVersionUID = 1L;

    private Sport nouveauSport;
    private List<Terrain> terrains;

    public Sport getNouveauSport() {
        return nouveauSport;
    }
    public void setNouveauSport(Sport nouveauSport) {
        this.nouveauSport = nouveauSport;
    }

    public List<Terrain> getTerrains() {
        return terrains;
    }
    public void setTerrains(List<Terrain> terrains) {
        this.terrains = terrains;
    }

    public SportManagedBean() {
        this.nouveauSport=new Sport();
        this.nouveauSport.setNom("nouveau sport");
        this.terrains=new ArrayList<>();
        this.terrains.add(new Terrain("T1", Surface.BETON));
        this.terrains.add(new Terrain("T2", Surface.PARQUET));
        this.terrains.add(new Terrain("T3", Surface.BETON));
    }
    public String ajouterLeSport()
    {
        //Traitement métier permettant l’ajout du sport
        //...
        return "ok";
    }

}

