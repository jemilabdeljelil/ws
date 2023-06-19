package mr.anrpts.orders.repository;

import java.util.Optional;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mr.anrpts.orders.model.StatutTitres2;

public interface StatutTitres2Repository extends JpaRepository<StatutTitres2 ,String>{
   
       //dernier date d'expiration
    @Query(value ="SELECT MAX(s.expirydt) FROM statut_titres2  s WHERE s.idValue = ?1 AND s.prodver_id = ?2 AND s.expirydt <= ?3",nativeQuery = true)

    Optional<LocalDate> findMaxExpiryDt(String idValue, Integer prodVerId, LocalDate expiryDt);
       //nombre total si aucun titre n'a expiré
    @Query(value ="SELECT COUNT(s.id) FROM statut_titres2  s WHERE s.idValue = ?1 AND s.prodver_id = ?2",nativeQuery = true)
    int countByIdValueAndProdVerId(String idValue, Integer prodVerId);
       //nombre titres après la dernière date d'expiration
    @Query(value ="SELECT COUNT(s.id) FROM statut_titres2 s WHERE s.idValue = ?1 AND s.prodver_id = ?2 AND s.expirydt > ?3",nativeQuery = true)
    int countExpiredAfter(String idValue, Integer prodVerId,LocalDate expiryDt);
}
