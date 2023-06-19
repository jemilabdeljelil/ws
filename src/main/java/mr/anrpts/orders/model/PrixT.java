package mr.anrpts.orders.model;

import javax.persistence.Column;

//import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prixt")
public class PrixT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODEDOC", nullable = false)
    private Integer codeDoc;

    @Column(name = "CODEDEM", nullable = false)
    private Integer codeDem;

    @Column(name = "MONTANT", nullable = false)
    private Double montant;

    @Column(name = "TRANSPORT", nullable = false)
    private Double transport;

    @Column(name = "cac", nullable = false)
    private String cac;

    public int getCodeDoc() {
        return codeDoc;
    }

    public void setCodeDoc(int codeDoc) {
        this.codeDoc = codeDoc;
    }

    public int getCodeDem() {
        return codeDem;
    }

    public void setCodeDem(int codeDem) {
        this.codeDem = codeDem;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Double getTransport() {
        return transport;
    }

    public void setTransport(Double transport) {
        this.transport = transport;
    }

    public String getCac() {
        return cac;
    }

    public void setCac(String cac) {
        this.cac = cac;
    }
}

