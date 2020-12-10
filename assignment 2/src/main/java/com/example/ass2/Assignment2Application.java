package com.example.ass2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class Assignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

}
