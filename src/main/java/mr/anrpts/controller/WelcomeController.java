package mr.anrpts.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mr.anrpts.dto.OrderDto;
import mr.anrpts.orders.model.Ordres;
import mr.anrpts.orders.model.Personnes;
import mr.anrpts.orders.model.PrixRemplacement;
import mr.anrpts.orders.repository.OrdresRepository;
import mr.anrpts.orders.repository.PersonnesRepository;
import mr.anrpts.orders.repository.PrixRemplacementRepository;
import mr.anrpts.orders.repository.PrixTRepository;
import mr.anrpts.orders.repository.SequenceRepository;
import mr.anrpts.orders.repository.StatutTitres2Repository;
import mr.anrpts.shipping.dao.DemandeRepositry;
import mr.anrpts.shipping.entity.AuthRequest;
import mr.anrpts.shipping.entity.Document;
import mr.anrpts.util.JwtUtil;

@RestController
public class WelcomeController {
    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);






    @Autowired
    private PersonnesRepository personnesService;
    @Autowired
    private OrdresRepository ordresRepository;
    @Autowired
    private StatutTitres2Repository statutTitres2Service;
    @Autowired
    private PrixTRepository prixTService;
    @Autowired
    private PrixRemplacementRepository prixRemplacementService;
    @Autowired
    private SequenceRepository sequenceService;

    /*@GetMapping("/orders")
    public String hello() {
        return "hello world";
    }*/

    @PostMapping("/generateOrdre")
    public ResponseEntity<?> generateOrdre(@RequestBody OrderDto orderDto) {
        String NumeroOrdre = "";
        int typdoc = 0;
        Double montant = 0.0, montantt = 0.0,montantTotal=0.0;
        LocalDate dexpiration = LocalDate.now();
        Integer tDemande = orderDto.getTypeDemande();
        Integer tDoc = orderDto.getTypeDocument();
        String cac = orderDto.getCac();
        String nni = orderDto.getNni();
        String login = orderDto.getLogin();
        Integer nbrExtrait =orderDto.getNbrExtrait();
        //cas des extraits
        if(tDoc==10 && nbrExtrait>0 ){
            montant=nbrExtrait*20.0;
        }else{
        switch (tDoc) {
            case 5:
                typdoc = 3;
                break;
            case 6:
                typdoc = 1;
                break;
            case 7:
                typdoc = 2;
                break;
            case 8:
                typdoc = 4;
                break;
            default:
                // Handle invalid input
                break;
        }
        int nb_resiliation = statutTitres2Service.countExpiredAfter(nni, typdoc, dexpiration);
        if (tDemande == 7) {
            tDemande = 1;
            montant = prixTService.findMontantByCodeDocAndCodeDemAndCac(tDoc, tDemande, cac);
            montantt = prixTService.findTransportByCodeDocAndCodeDemAndCac(tDoc, tDemande, cac);

        } else if (tDemande != 2 && tDemande != 0) {
            montant = prixTService.findMontantByCodeDocAndCodeDemAndCac(tDoc, tDemande, cac);
            montantt = prixTService.findTransportByCodeDocAndCodeDemAndCac(tDoc, tDemande, cac);
        } else if (tDemande != 0) {
            PrixRemplacement prixRemlacemet = new PrixRemplacement();
            prixRemlacemet = prixRemplacementService.findByTypeDocumentAndCac(tDoc, cac);
            switch (nb_resiliation) {
                case 1:
                    montant = prixRemlacemet.getPrixRemplacement1();
                    break;
                case 2:
                    montant = prixRemlacemet.getPrixRemplacement2();
                    break;
                case 3:
                    montant = prixRemlacemet.getPrixRemplacement3();
                    break;
                case 4:
                    montant = prixRemlacemet.getPrixRemplacement4();
                    break;
            }
            if (nb_resiliation > 4) {
                montant = prixRemlacemet.getPrixRemplacement4();
            }
            montantt = prixRemlacemet.getTransport();

        }
    }
        NumeroOrdre = cac + tDoc + tDemande + sequenceService.findAllSEQ()+1;
        sequenceService.incrementSeq();
        Personnes personnes = personnesService.findById(nni).get();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dategen = currentDateTime.format(formatter);
        String tDocString = Integer.toString(tDoc);
        String tDemandeString = Integer.toString(tDemande);
        Ordres ordre = new Ordres(NumeroOrdre, dategen, cac, login, tDocString, tDemandeString, montant, nni,
        personnes.getPrenomFr(), personnes.getPrenomPereFr(), personnes.getNomFamilleFr(),
        personnes.getPrenomAr(), personnes.getPrenomPereAr(), personnes.getNomFamilleAr(),
        personnes.getDateNaissance(), personnes.getLieuNaissanceFr(), personnes.getLieuNaissanceAr(),
        personnes.getPrenomPereFr(), personnes.getProfessionAr(), personnes.getTypePersonne(), montantt, "MRU",
        false, 0, null, false);

        try {
            ordresRepository.save(ordre);

        } catch (Exception e) {

            // return ResponseEntity.ok("Une ereur est survenu ressayer ulterieurment!");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Une erreur est survenue, réessayer ultérieurement!");
        }
        montantTotal=montant+montantt;
        List<String> orderData = new ArrayList<String>();
        orderData.add(NumeroOrdre);
        orderData.add(montantTotal.toString());
        return ResponseEntity.ok(orderData);
    }

    @GetMapping("/IsAcquitted")
    public ResponseEntity<Boolean> IsAcquitted(@RequestParam("numOrdre") String numOrdre) {

        return ResponseEntity.ok(ordresRepository.findOrdresByNumero(numOrdre).isAcquite());

    }










    
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    DemandeRepositry demandeRepository;

    @PostMapping("/getDelivered")
    public ResponseEntity<List<Document>> getDelivered(@RequestBody List<String> listNud) {
        List<Document> list = null;
        try {
            list = demandeRepository.getDelivered(listNud);

            if (list == null || list.isEmpty()) {
                return new ResponseEntity<>(list, HttpStatus.NO_CONTENT);
            } else {
                for (Document doc : list) {
                    doc.setStatus(5);
                }
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception ex) {
            log.error(String.join(",", listNud), ex);
            return new ResponseEntity<>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/getShipped")
    public ResponseEntity<List<Document>> getShipped(@RequestBody  List<String> listNud) {
        List<Document> list = null;
        try {
            list = demandeRepository.getShipped(listNud);
            if (list == null || list.isEmpty()) {
                return new ResponseEntity<>(list, HttpStatus.NO_CONTENT);
            } else {
                for (Document doc : list) {
                    if (doc.getStatus() == 510)
                        doc.setStatus(4);
                    else
                        doc.setStatus(5);
                }
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception ex) {
            log.error(String.join(",", listNud), ex);
            return new ResponseEntity<>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/authenticate")
    public ResponseEntity<String> generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            log.info(authRequest.getLogin() + "/" + authRequest.getPassword());
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getLogin(), authRequest.getPassword()));
           

            if (auth.isAuthenticated()) {
                log.info("-- ok --");
                return new ResponseEntity<>(jwtUtil.generateToken(authRequest.getLogin()), HttpStatus.OK);
               
            } else {
                return new ResponseEntity<>("", HttpStatus.UNAUTHORIZED);
            }
        
        } catch (Exception ex) {
            log.error(authRequest.getLogin() + " " + authRequest.getPassword(), ex);
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
}
