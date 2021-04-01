package spring_boot_jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import spring_boot_jpa.entities.User;
import spring_boot_jpa.services.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("John", "Admin");
		
		userRepository.save(user);
		
		log.info("New user is created with id: " + user.getId());
		log.info("User: " + user);
		
		Optional<User> use = userRepository.findById(1L);
		
		log.info("\n\nUser retrieved: " +use+"\n\n");
		
		List<User> list = userRepository.findAll();
		
		log.info("\n\nAll users: " + list+"\n\n");
	}
	
}
