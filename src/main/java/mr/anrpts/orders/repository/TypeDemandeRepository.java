package mr.anrpts.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.anrpts.orders.model.TypeDemande;

public interface TypeDemandeRepository extends JpaRepository<TypeDemande ,Integer>{
    
}
