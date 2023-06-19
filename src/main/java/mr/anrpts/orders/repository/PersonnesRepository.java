package mr.anrpts.orders.repository;
import mr.anrpts.orders.model.Personnes;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnesRepository extends JpaRepository<Personnes ,String> {
      Optional<Personnes>  findById(String nni);
}
