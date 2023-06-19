package mr.anrpts.orders.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mr.anrpts.orders.model.PrixT;

public interface PrixTRepository extends JpaRepository<PrixT, Long> {

    @Query("SELECT p.transport FROM PrixT p WHERE p.codeDoc = ?1 AND p.codeDem = ?2 AND p.cac = ?3")
    Double findTransportByCodeDocAndCodeDemAndCac(int codeDoc, int codeDem, String cac);


     @Query("SELECT p.montant FROM PrixT p WHERE p.codeDoc = :codeDoc AND p.codeDem = :codeDem AND p.cac = :cac")
    Double findMontantByCodeDocAndCodeDemAndCac(@Param("codeDoc") Integer codeDoc, @Param("codeDem") Integer codeDem, @Param("cac") String cac);
    
 }
 
