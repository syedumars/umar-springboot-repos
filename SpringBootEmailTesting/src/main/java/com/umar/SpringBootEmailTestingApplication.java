package com.umar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;

import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootEmailTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailTestingApplication.class, args);
}

	@Autowired
	private EmailService newEmailservice;

	@EventListener(ApplicationReadyEvent.class)
	public void sendingEmail() {
		newEmailservice.sendEmail("syedumar1992@gmail.com", "Syed's 1st Spring-Boot email - reg", "My Test email");
	}
	
}
