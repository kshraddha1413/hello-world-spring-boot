package com.javadevelopersguide.springboot.example.hello_world_spring_boot;

import org.springframework.boot.SpringApplication;

public class SpringBootApplicationLuncher {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}
}
