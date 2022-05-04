package com.complexe.entities;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Entity implementation class for Entity: Carnet
 *
 */
@Entity
@Table(name = "carnet")
public class Carnet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifiant;
    @Column(name = "nombre_entrees", nullable = false)
    private int nombreEntrees;

    @ManyToOne
    @JoinColumn(name = "fk_identifiant_client", foreignKey = @ForeignKey(name = "fk_carnets_clients"))
    private Client client;

    @ManyToOne
    @JoinColumn(name = "fk_identifiant_sport", foreignKey = @ForeignKey(name = "fk_carnets_sports"))
    private Sport sport;

    public Carnet() {
        super();
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getNombreEntrees() {
        return nombreEntrees;
    }

    public void setNombreEntrees(int nombreEntrees) {
        this.nombreEntrees = nombreEntrees;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

}