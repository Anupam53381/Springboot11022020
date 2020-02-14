package com.zensar;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringStarterProjectApplication.class, args);
		
		new SpringApplicationBuilder(SpringStarterProjectApplication.class)
		.properties("spring.config.name:application")
		.properties("server.port:5000")
		.run(args);
	}

}
