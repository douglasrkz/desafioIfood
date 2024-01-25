package com.douglasoliveira.desafiobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DesafioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBackendApplication.class, args);
	}

}
