package mr.anrpts.orders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "typedemande")
public class TypeDemande {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "CODE")
    private Integer code;
    
    @Column(name = "LIBELLE")
    private String libelle;
    
    @Column(name = "LIBELLEA")
    private String libelleA;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelleA() {
        return libelleA;
    }

    public void setLibelleA(String libelleA) {
        this.libelleA = libelleA;
    }
}

