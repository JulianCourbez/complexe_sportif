package com.complexe.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clients")
@SecondaryTable(name = "preferences", pkJoinColumns = @PrimaryKeyJoinColumn(name = "fk_identifiant_client"), foreignKey = @ForeignKey(name = "fk_preferences_client"))
@NamedQuery(name = "SelectByName", query = "Select c from Client c WHERE c.nom=:nom")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifiant;
    @Column(length = 255, nullable = false)
    private String nom;
    @Column(length = 255, nullable = false)
    private String prenom;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 100, nullable = false, name = "mot_de_passe")
    private String motDePasse;
    @Column(length = 45, table = "preferences")
    private String theme;
    @Column(length = 45, table = "preferences")
    private String langue;

    private Adresse adresse;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_identifiant_client", foreignKey = @ForeignKey(name = "fk_message_client"))
    private List<Message> messages;

    @OneToMany(mappedBy = "client")
    private List<Carnet> carnet;

    public Client() {
        super();
    }

    public Client(String nom, String prenom, String email, String motDePasse, String langue, Adresse adresse) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.langue = langue;
        this.adresse = adresse;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Carnet> getCarnet() {
        return carnet;
    }

    public void setCarnet(List<Carnet> carnet) {
        this.carnet = carnet;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

}