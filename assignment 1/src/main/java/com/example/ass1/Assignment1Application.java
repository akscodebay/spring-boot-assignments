package com.example.ass1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment1Application {
	
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(Assignment1Application.class, args);
		beanNames();
	}
	
	public static void beanNames() {
		String[] beans = applicationContext.getBeanDefinitionNames();
		System.out.println("List of Spring Managed Beans");
		for(String bean: beans) {
			System.out.println(bean);
		}
	}

}
