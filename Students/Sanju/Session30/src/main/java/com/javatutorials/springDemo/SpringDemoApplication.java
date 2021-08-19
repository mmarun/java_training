package com.javatutorials.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		System.out.println("Hi Sanju, This is a Spring Demo");
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
