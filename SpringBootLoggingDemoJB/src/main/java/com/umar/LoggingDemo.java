package com.umar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingDemo {

	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/")
	public String home() {
		//log levels with methods + priority
		logger.trace("home method accessed with TRACE()");
		logger.debug("home method accessed with DEBUG()");
		logger.info("home method accessed with INFO()");
		logger.warn("home method accessed with WARN()");
		logger.error("home method accessed with ERROR()");
		
		return "Hello from my Spring Boot Home page";
		
	}
}
