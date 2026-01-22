package com.mycom.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan(basePackages={"com.mycom.springboot.controller"})

public class SpringbootHelloworldApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
		System.out.println("Welcome to Spring Boot!");
	}
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Spring Boot Application Runner has started!");
		
	}

}
