package com.umar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


//We learnt Dependency Injection and Autowiring in this project

@SpringBootApplication
public class SpringBootTeluskoStarterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= 
				SpringApplication.run(SpringBootTeluskoStarterApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
