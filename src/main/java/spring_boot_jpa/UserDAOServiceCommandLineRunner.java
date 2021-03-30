package spring_boot_jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring_boot_jpa.entities.User;
import spring_boot_jpa.services.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	UserDAOService userDAOService;
	
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		long id = userDAOService.insert(user);
		
		log.info("New user is created with id: " + id);
		log.info("User: " + user);
		
	}
	
}
