package mr.anrpts.shipping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mr.anrpts.shipping.entity.Document;

public interface DemandeRepositry extends JpaRepository<Document, Integer> {

	@Query("from Document a where a.status in (605,608,610) AND a.nud IN :listNud")
	List<Document> getDelivered(@Param("listNud") List<String> listNud);

	@Query("from Document a where a.status in (605,608,610,510) AND a.nud IN :listNud")
	List<Document> getShipped(@Param("listNud") List<String> listNud);
}
