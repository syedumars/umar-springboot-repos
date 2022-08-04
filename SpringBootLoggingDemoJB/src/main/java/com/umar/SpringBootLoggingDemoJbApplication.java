package com.umar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLoggingDemoJbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootLoggingDemoJbApplication.class, args);
		Home h =  context.getBean(Home.class);
		h.connect();
		
		//calling it again to check if the constructor is called again
		//but the result is "NO". Constructor is called only once as Singleton is default.
		//Add the @Scope=value("prototype") in the Internet class
		Home h2 =  context.getBean(Home.class);
		h2.connect();
	}

}
