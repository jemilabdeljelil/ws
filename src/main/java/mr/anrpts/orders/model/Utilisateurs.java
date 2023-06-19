package mr.anrpts.orders.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateurs")
public class Utilisateurs {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "mdp")
    private String mdp;
    
    @Column(name = "CAC")
    private String cac;
    
    @Column(name = "NNI")
    private String nni;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "nom_ar")
    private String nomAr;
    
    @Column(name = "profil")
    private Integer profil;
    
    @Column(name = "date")
    private LocalDateTime date;

    public Utilisateurs() {
        // default constructor
    }

    public Utilisateurs(int id, String login, String mdp, String cac, String nni, String nom, String nomAr, int profil, LocalDateTime date) {
        this.id = (long) id;
        this.login = login;
        this.mdp = mdp;
        this.cac = cac;
        this.nni = nni;
        this.nom = nom;
        this.nomAr = nomAr;
        this.profil = profil;
        this.date = date;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getCac() {
        return cac;
    }

    public void setCac(String cac) {
        this.cac = cac;
    }

    public String getNni() {
        return nni;
    }

    public void setNni(String nni) {
        this.nni = nni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomAr() {
        return nomAr;
    }

    public void setNomAr(String nomAr) {
        this.nomAr = nomAr;
    }

    public int getProfil() {
        return profil;
    }

    public void setProfil(int profil) {
        this.profil = profil;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

