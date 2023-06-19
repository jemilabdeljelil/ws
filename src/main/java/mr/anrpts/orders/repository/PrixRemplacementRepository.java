package mr.anrpts.orders.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import mr.anrpts.orders.model.PrixRemplacement;

public interface PrixRemplacementRepository extends JpaRepository<PrixRemplacement ,Long>{


    PrixRemplacement findByTypeDocumentAndCac(int typeDocument, String cac);
    
}
