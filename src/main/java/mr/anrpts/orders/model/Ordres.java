package mr.anrpts.orders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordres")
public class Ordres {

    @Id
    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "DATEORDRE")
    private String dateOrdre;

    @Column(name = "CODECAC")
    private String codeCac;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "TYPEDOC")
    private String typeDoc;

    @Column(name = "TYPEDEM")
    private String typeDem;

    @Column(name = "MONTANT")
    private Double montant;

    @Column(name = "NNI")
    private String nni;

    @Column(name = "PRENOM_FR")
    private String prenomFr;

    @Column(name = "PRENOM_PERE_FR")
    private String prenomPereFr;

    @Column(name = "NOM_FAMILLE_FR")
    private String nomFamilleFr;

    @Column(name = "PRENOM_AR")
    private String prenomAr;

    @Column(name = "PRENOM_PERE_AR")
    private String prenomPereAr;

    @Column(name = "NOM_FAMILLE_AR")
    private String nomFamilleAr;

    @Column(name = "DATE_NAISSANCE")
    private String dateNaissance;

    @Column(name = "LIEU_NAISSANCE_FR")
    private String lieuNaissanceFr;

    @Column(name = "LIEU_NAISSANCE_AR")
    private String lieuNaissanceAr;

    @Column(name = "PROFESSION_FR")
    private String professionFr;

    @Column(name = "PROFESSION_AR")
    private String professionAr;

    @Column(name = "TYPE_PERSONNE")
    private String typePersonne;

    @Column(name = "TRANSPORT")
    private Double transport;

    @Column(name = "devise")
    private String devise;

    @Column(name = "acquite")
    private boolean acquite;

    @Column(name = "reprise")
    private int reprise;

    @Column(name = "Nrecette")
    private String nRecette;

    @Column(name = "sent")
    private boolean sent;

    // getters and setters



         //default constrictor
        public Ordres() {
        }

        public String getTypeDem() {
            return typeDem;
        }

        public void setTypeDem(String typeDem) {
            this.typeDem = typeDem;
        }

        public double getMontant() {
            return montant;
        }

        public void setMontant(double montant) {
            this.montant = montant;
        }

        public String getNni() {
            return nni;
        }

        public void setNni(String nni) {
            this.nni = nni;
        }

        public String getPrenomFr() {
            return prenomFr;
        }

        public void setPrenomFr(String prenomFr) {
            this.prenomFr = prenomFr;
        }

        public String getPrenomPereFr() {
            return prenomPereFr;
        }

        public void setPrenomPereFr(String prenomPereFr) {
            this.prenomPereFr = prenomPereFr;
        }

        public String getNomFamilleFr() {
            return nomFamilleFr;
        }

        public void setNomFamilleFr(String nomFamilleFr) {
            this.nomFamilleFr = nomFamilleFr;
        }

        public String getPrenomAr() {
            return prenomAr;
        }

        public void setPrenomAr(String prenomAr) {
            this.prenomAr = prenomAr;
        }

        public String getPrenomPereAr() {
            return prenomPereAr;
        }

        public void setPrenomPereAr(String prenomPereAr) {
            this.prenomPereAr = prenomPereAr;
        }

        public String getNomFamilleAr() {
            return nomFamilleAr;
        }

        public void setNomFamilleAr(String nomFamilleAr) {
            this.nomFamilleAr = nomFamilleAr;
        }

        public String getDateNaissance() {
            return dateNaissance;
        }

        public void setDateNaissance(String dateNaissance) {
            this.dateNaissance = dateNaissance;
        }

        public String getLieuNaissanceFr() {
            return lieuNaissanceFr;
        }

        public void setLieuNaissanceFr(String lieuNaissanceFr) {
            this.lieuNaissanceFr = lieuNaissanceFr;
        }

        public String getLieuNaissanceAr() {
            return lieuNaissanceAr;
        }

        public void setLieuNaissanceAr(String lieuNaissanceAr) {
            this.lieuNaissanceAr = lieuNaissanceAr;
        }

        public String getProfessionFr() {
            return professionFr;
        }

        public void setProfessionFr(String professionFr) {
            this.professionFr = professionFr;
        }

        public String getProfessionAr() {
            return professionAr;
        }

        public void setProfessionAr(String professionAr) {
            this.professionAr = professionAr;
        }

        public String getTypePersonne() {
            return typePersonne;
        }

        public void setTypePersonne(String typePersonne) {
            this.typePersonne = typePersonne;
        }

        public double getTransport() {
            return transport;
        }

        public void setTransport(double transport) {
            this.transport = transport;
        }

        public String getDevise() {
            return devise;
        }

        public void setDevise(String devise) {
            this.devise = devise;
        }

        public boolean isAcquite() {
            return acquite;
        }

        public void setAcquite(boolean acquite) {
            this.acquite = acquite;
        }

        public int getReprise() {
            return reprise;
        }

        public void setReprise(int reprise) {
            this.reprise = reprise;
        }

        public String getnRecette() {
            return nRecette;
        }

        public void setnRecette(String nRecette) {
            this.nRecette = nRecette;
        }

        public boolean isSent() {
            return sent;
        }

        public void setSent(boolean sent) {
            this.sent = sent;
        }

        // Constructor
        public Ordres(String numero, String dateOrdre, String codeCac, String login, String typeDoc, String typeDem, double montant,
                String nni, String prenomFr, String prenomPereFr, String nomFamilleFr, String prenomAr, String prenomPereAr,
                String nomFamilleAr, String dateNaissance, String lieuNaissanceFr, String lieuNaissanceAr, String professionFr,
                String professionAr, String c, double transport, String devise, boolean acquite, int reprise, String nRecette, boolean sent) {
            this.numero = numero;
            this.dateOrdre = dateOrdre;
            this.codeCac = codeCac;
            this.login = login;
            this.typeDoc = typeDoc;
            this.typeDem = typeDem;
            this.montant = montant;
            this.nni = nni;
            this.prenomFr = prenomFr;
            this.prenomPereFr = prenomPereFr;
            this.nomFamilleFr = nomFamilleFr;
            this.prenomAr = prenomAr;
            this.prenomPereAr = prenomPereAr;
            this.nomFamilleAr = nomFamilleAr;
            this.dateNaissance = dateNaissance;
            this.lieuNaissanceFr = lieuNaissanceFr;
            this.lieuNaissanceAr = lieuNaissanceAr;
            this.professionFr = professionFr;
            this.professionAr = professionAr;
            this.typePersonne = c;
            this.transport = transport;
            this.devise = devise;
            this.acquite = acquite;
            this.reprise = reprise;
            this.nRecette = nRecette;
            this.sent = sent;
        }
        
        // Getters and Setters
        public String getNumero() {
            return numero;
        }
    
        public void setNumero(String numero) {
            this.numero = numero;
        }
    
        public String getDateOrdre() {
            return dateOrdre;
        }
    
        public void setDateOrdre(String dateOrdre) {
            this.dateOrdre = dateOrdre;
        }
    
        public String getCodeCac() {
            return codeCac;
        }
    
        public void setCodeCac(String codeCac) {
            this.codeCac = codeCac;
        }
    
        public String getLogin() {
            return login;
        }
    
        public void setLogin(String login) {
            this.login = login;
        }
    
        public String getTypeDoc() {
            return typeDoc;
        }
    
        public void setTypeDoc(String typeDoc) {
            this.typeDoc = typeDoc;
       
    
     
}
    }