package spring_boot_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JPA_RESTful_application {

	public static void main(String[] args ) {
//		ApplicationContext context = 
				
		SpringApplication.run(JPA_RESTful_application.class, args);
		
//		int i = 0;
//		
//		for(String beanName: context.getBeanDefinitionNames()) {
//			System.out.println("Bean: " + ++i +". "+beanName);
//		}
		
	}

}
