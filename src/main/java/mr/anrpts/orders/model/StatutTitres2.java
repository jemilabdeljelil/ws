package mr.anrpts.orders.model;



import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statut_titres2")
public class StatutTitres2 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "idvalue", nullable = false)
    private String idValue;
    
    @Column(name = "prodver_id", nullable = false)
    private Integer prodverId;
    
    @Column(name = "custcard_id", nullable = false)
    private Integer custcardId;
    
    @Column(name = "expirydt", nullable = false)
    private LocalDateTime expiryDt;
    
    @Column(name = "CARDSTATHIST_ID")
    private String cardStatHistId;

    // Constructors
    public StatutTitres2() {}

    public StatutTitres2(int id, String idValue, int prodVerId, int custCardId, LocalDateTime expiryDt, String cardStatHistId) {
        this.id = id;
        this.idValue = idValue;
        this.prodverId = prodVerId;
        this.custcardId = custCardId;
        this.expiryDt = expiryDt;
        this.cardStatHistId = cardStatHistId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public int getProdVerId() {
        return prodverId;
    }

    public void setProdVerId(int prodVerId) {
        this.prodverId = prodVerId;
    }

    public int getCustCardId() {
        return custcardId;
    }

    public void setCustCardId(int custCardId) {
        this.custcardId = custCardId;
    }

    public LocalDateTime getExpiryDt() {
        return expiryDt;
    }

    public void setExpiryDt(LocalDateTime expiryDt) {
        this.expiryDt = expiryDt;
    }

    public String getCardStatHistId() {
        return cardStatHistId;
    }

    public void setCardStatHistId(String cardStatHistId) {
        this.cardStatHistId = cardStatHistId;
    }
}

