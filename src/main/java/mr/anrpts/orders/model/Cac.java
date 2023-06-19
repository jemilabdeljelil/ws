package mr.anrpts.orders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cac")
public class Cac {
    
    @Id
    @Column(name = "cac", nullable = false)
    private String cac;
   
    @Column(name = "ncod_c", nullable = false)
    private String ncod_c;
    
    @Column(name = "nom_cac", nullable = false)
    private String nom_cac;
    
    @Column(name = "nom_cacar", nullable = false)
    private String nom_cacar;
    
    @Column(name = "WILAMOU", nullable = false)
    private String wilamou;
    
    @Column(name = "codecac", nullable = false)
    private String codecac;
    
    @Column(name = "devise", nullable = false, columnDefinition = "varchar(10) default 'MRU'")
    private String devise;

    public String getCac() {
        return cac;
    }

    public void setCac(String cac) {
        this.cac = cac;
    }

    public String getNcod_c() {
        return ncod_c;
    }

    public void setNcod_c(String ncod_c) {
        this.ncod_c = ncod_c;
    }

    public String getNom_cac() {
        return nom_cac;
    }

    public void setNom_cac(String nom_cac) {
        this.nom_cac = nom_cac;
    }

    public String getNom_cacar() {
        return nom_cacar;
    }

    public void setNom_cacar(String nom_cacar) {
        this.nom_cacar = nom_cacar;
    }

    public String getWilamou() {
        return wilamou;
    }

    public void setWilamou(String wilamou) {
        this.wilamou = wilamou;
    }

    public String getCodecac() {
        return codecac;
    }

    public void setCodecac(String codecac) {
        this.codecac = codecac;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

   

   
}

