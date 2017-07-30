package com.springboot.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.controllers")
public class ApplicationEntryPointClass {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(ApplicationEntryPointClass.class, args);

	}

}
