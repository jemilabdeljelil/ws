package mr.anrpts.orders.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personnes")
public class Personnes {
    
    @Id
    @Column(name = "NNI", length = 10)
    private String nni;
    
    @Column(name = "PRENOM_FR", length = 70)
    private String prenomFr;
    
    @Column(name = "PRENOM_AR", length = 70)
    private String prenomAr;
    
    @Column(name = "PRENOM_PERE_FR", length = 70)
    private String prenomPereFr;
    
    @Column(name = "PRENOM_PERE_AR", length = 70)
    private String prenomPereAr;
    
    @Column(name = "NOM_FAMILLE_FR", length = 70)
    private String nomFamilleFr;
    
    @Column(name = "NOM_FAMILLE_AR", length = 70)
    private String nomFamilleAr;
    
    @Column(name = "DATE_NAISSANCE", length = 30)
    private String dateNaissance;
    
    @Column(name = "LIEU_NAISSANCE_FR", length = 100)
    private String lieuNaissanceFr;
    
    @Column(name = "LIEU_NAISSANCE_AR", length = 100)
    private String lieuNaissanceAr;
    
    @Column(name = "PROFESSION_FR", length = 100)
    private String professionFr;
    
    @Column(name = "PROFESSION_AR", length = 100)
    private String professionAr;
    
    @Column(name = "NNI_REF", length = 18)
    private String nniRef;
    
    @Column(name = "NUC", length = 20)
    private String nuc;
    
    @Column(name = "NUD", length = 22)
    private String nud;
    
    @Column(name = "NUM_CNI_REF", length = 16)
    private String numCniRef;
    
    @Column(name = "SEXE_FR", length = 10)
    private String sexeFr;
    
    @Column(name = "SEXE_AR", length = 10)
    private String sexeAr;
    
    @Column(name = "NB_ID_RESILIE")
    private Integer nbIdResilie;
    
    @Column(name = "NB_NP_RESILIE")
    private Integer nbNpResilie;
    
    @Column(name = "NB_VP_RESILIE")
    private Integer nbVpResilie;
    
    @Column(name = "TYPE_PERSONNE", length = 1)
    private String typePersonne;
    
    @Column(name = "NB_R_RESILIE")
    private Integer nbRResilie;
    
    @Column(name = "anneenaiss", length = 4)
    private String anneeNaiss;


        
        //defaul constrictor
        public Personnes() {
        }

        public String getPrenomPereAr() {
            return prenomPereAr;
        }

        public void setPrenomPereAr(String prenomPereAr) {
            this.prenomPereAr = prenomPereAr;
        }

        public String getNomFamilleFr() {
            return nomFamilleFr;
        }

        public void setNomFamilleFr(String nomFamilleFr) {
            this.nomFamilleFr = nomFamilleFr;
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

        public String getNniRef() {
            return nniRef;
        }

        public void setNniRef(String nniRef) {
            this.nniRef = nniRef;
        }

        public String getNuc() {
            return nuc;
        }

        public void setNuc(String nuc) {
            this.nuc = nuc;
        }

        public String getNud() {
            return nud;
        }

        public void setNud(String nud) {
            this.nud = nud;
        }

        public String getNumCniRef() {
            return numCniRef;
        }

        public void setNumCniRef(String numCniRef) {
            this.numCniRef = numCniRef;
        }

        public String getSexeFr() {
            return sexeFr;
        }

        public void setSexeFr(String sexeFr) {
            this.sexeFr = sexeFr;
        }

        public String getSexeAr() {
            return sexeAr;
        }

        public void setSexeAr(String sexeAr) {
            this.sexeAr = sexeAr;
        }

        public int getNbIdResilie() {
            return nbIdResilie;
        }

        public void setNbIdResilie(int nbIdResilie) {
            this.nbIdResilie = nbIdResilie;
        }

        public int getNbNpResilie() {
            return nbNpResilie;
        }

        public void setNbNpResilie(int nbNpResilie) {
            this.nbNpResilie = nbNpResilie;
        }

        public int getNbVpResilie() {
            return nbVpResilie;
        }

        public void setNbVpResilie(int nbVpResilie) {
            this.nbVpResilie = nbVpResilie;
        }

        public String getTypePersonne() {
            return typePersonne;
        }

        public void setTypePersonne(String typePersonne) {
            this.typePersonne = typePersonne;
        }

        public int getNbRResilie() {
            return nbRResilie;
        }

        public void setNbRResilie(int nbRResilie) {
            this.nbRResilie = nbRResilie;
        }

        public String getAnneeNaiss() {
            return anneeNaiss;
        }

        public void setAnneeNaiss(String anneeNaiss) {
            this.anneeNaiss = anneeNaiss;
        }

        public Personnes(String nni, String prenomFr, String prenomAr, String prenomPereFr, String prenomPereAr, String nomFamilleFr, String nomFamilleAr, String dateNaissance, String lieuNaissanceFr, String lieuNaissanceAr, String professionFr, String professionAr, String nniRef, String nuc, String nud, String numCniRef, String sexeFr, String sexeAr, int nbIdResilie, int nbNpResilie, int nbVpResilie, String typePersonne, int nbRResilie, String anneeNaiss) {
            this.nni = nni;
            this.prenomFr = prenomFr;
            this.prenomAr = prenomAr;
            this.prenomPereFr = prenomPereFr;
            this.prenomPereAr = prenomPereAr;
            this.nomFamilleFr = nomFamilleFr;
            this.nomFamilleAr = nomFamilleAr;
            this.dateNaissance = dateNaissance;
            this.lieuNaissanceFr = lieuNaissanceFr;
            this.lieuNaissanceAr = lieuNaissanceAr;
            this.professionFr = professionFr;
            this.professionAr = professionAr;
            this.nniRef = nniRef;
            this.nuc = nuc;
            this.nud = nud;
            this.numCniRef = numCniRef;
            this.sexeFr = sexeFr;
            this.sexeAr = sexeAr;
            this.nbIdResilie = nbIdResilie;
            this.nbNpResilie = nbNpResilie;
            this.nbVpResilie = nbVpResilie;
            this.typePersonne = typePersonne;
            this.nbRResilie = nbRResilie;
            this.anneeNaiss = anneeNaiss;
        }
    
        // getters and setters for all fields
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
    
        public String getPrenomAr() {
            return prenomAr;
        }
    
        public void setPrenomAr(String prenomAr) {
            this.prenomAr = prenomAr;
        }
    
        public String getPrenomPereFr() {
            return prenomPereFr;
       
    
}
    }
