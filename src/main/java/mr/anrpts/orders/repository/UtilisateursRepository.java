package mr.anrpts.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.anrpts.orders.model.Utilisateurs;

public interface UtilisateursRepository extends JpaRepository<Utilisateurs ,String> {
    
    Utilisateurs   findUtilisateursByLogin(String login);
}
