package com.example.PostgresTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class PostgresTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresTestApplication.class, args);
	}

}
