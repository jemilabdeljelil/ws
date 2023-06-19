package mr.anrpts.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.anrpts.orders.model.TypeDocument;

public interface TypeDocumentRepository extends JpaRepository<TypeDocument ,Integer> {
    
}
