package mr.anrpts.shipping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.anrpts.shipping.entity.User;


public interface UserRepositry extends JpaRepository<User, Integer>{

	User findByLogin(String login);

}
