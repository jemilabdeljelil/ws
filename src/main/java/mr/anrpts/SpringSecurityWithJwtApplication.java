package mr.anrpts;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;


@SpringBootApplication
@EnableRetry
public class SpringSecurityWithJwtApplication {
	
	//@Autowired
	//private UserRepositry userRepositry;
	
	@PostConstruct
	public void initUsers() {
	//	List<User> users = Stream.of(
	//			new User(101, "javatechie", "password", "javatechie@gmail.com"),
    //            new User(102, "user1", "pwd1", "user1@gmail.com"),
    //            new User(103, "user2", "pwd2", "user2@gmail.com"),
    //            new User(104, "user3", "pwd3", "user3@gmail.com")
    //      ).collect(Collectors.toList());
	//	userRepositry.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithJwtApplication.class, args);
	}

}
