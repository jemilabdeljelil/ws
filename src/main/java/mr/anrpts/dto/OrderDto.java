package mr.anrpts.dto;

public class OrderDto {
    
    private String nni;
    private Integer typeDocument;
    private Integer typeDemande;
    private Integer nbrExtrait;  
    private String login;
    private String cac;



    public OrderDto() {
    }


    public String getNni() {
        return nni;
    }
    public void setNni(String nni) {
        this.nni = nni;
    }
    public Integer getTypeDocument() {
        return typeDocument;
    }
    public void setTypeDocument(Integer typeDocument) {
        this.typeDocument = typeDocument;
    }
    public Integer getTypeDemande() {
        return typeDemande;
    }
    public void setTypeDemande(Integer typeDemande) {
        this.typeDemande = typeDemande;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getCac() {
        return cac;
    }
    public void setCac(String cac) {
        this.cac = cac;
    }
    public Integer getNbrExtrait() {
        return nbrExtrait;
    }
    public void setNbrExtrait(Integer nbrExtrait) {
        this.nbrExtrait = nbrExtrait;
    }
    
}
