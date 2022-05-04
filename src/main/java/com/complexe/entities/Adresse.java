package com.complexe.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Entity implementation class for Entity: Adresse
 *
 */
@Embeddable
@Table(name = "adresse")
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(length = 255, nullable = false)
    private String rue;
    @Column(name = "code_postal", nullable = false)
    private int codePostal;
    @Column(length = 45, nullable = false)
    private String ville;

    public Adresse(String rue, int codePostal, String ville) {
        super();
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Adresse() {
        super();
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

}