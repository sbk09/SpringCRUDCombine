package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EntityScan("com.*.*")
@EnableJpaRepositories("com.*.*")
@ComponentScan("com.*.*")
@SpringBootApplication
public class SpringBootCrud2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrud2Application.class, args);
	}

}
