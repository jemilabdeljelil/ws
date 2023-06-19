package mr.anrpts.orders.repository;
import mr.anrpts.orders.model.Ordres;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrdresRepository extends JpaRepository<Ordres ,String> {
    Ordres findOrdresByNumero(String numero);
}
