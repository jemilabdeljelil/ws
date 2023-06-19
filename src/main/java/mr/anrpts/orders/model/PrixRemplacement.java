package mr.anrpts.orders.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prix_remplacement")
public class PrixRemplacement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "TYPE_DOCUMENT")
    private Integer typeDocument;
    
    @Column(name = "PRIX_RAMPL1")
    private Double prixRemplacement1;
    
    @Column(name = "PRIX_RAMPL2")
    private Double prixRemplacement2;
    
    @Column(name = "PRIX_RAMPL3")
    private Double prixRemplacement3;
    
    @Column(name = "PRIX_RAMPL4")
    private Double prixRemplacement4;
    
    @Column(name = "TRANSPORT")
    private Double transport;
    
    @Column(name = "cac")
    private String cac;

    public int getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(int typeDocument) {
        this.typeDocument = typeDocument;
    }

    public Double getPrixRemplacement1() {
        return prixRemplacement1;
    }

    public void setPrixRemplacement1(Double prixRemplacement1) {
        this.prixRemplacement1 = prixRemplacement1;
    }

    public Double getPrixRemplacement2() {
        return prixRemplacement2;
    }

    public void setPrixRemplacement2(Double prixRemplacement2) {
        this.prixRemplacement2 = prixRemplacement2;
    }

    public Double getPrixRemplacement3() {
        return prixRemplacement3;
    }

    public void setPrixRemplacement3(Double prixRemplacement3) {
        this.prixRemplacement3 = prixRemplacement3;
    }

    public Double getPrixRemplacement4() {
        return prixRemplacement4;
    }

    public void setPrixRemplacement4(Double prixRemplacement4) {
        this.prixRemplacement4 = prixRemplacement4;
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

