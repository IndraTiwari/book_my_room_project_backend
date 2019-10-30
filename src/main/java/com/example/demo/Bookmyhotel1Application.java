package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.example.demo.repository")
@SpringBootApplication
public class Bookmyhotel1Application {

	public static void main(String[] args) {
		SpringApplication.run(Bookmyhotel1Application.class, args);
	}

}
