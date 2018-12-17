package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class PostFilterApplication extends AbstractAplicationContext{

	public static void main(String[] args) {
		SpringApplication.run(PostFilterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application Started");
		
	}

}

