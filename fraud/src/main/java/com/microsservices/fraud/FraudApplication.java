package com.microsservices.fraud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class FraudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraudApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(FraudCheckRepository repository){
		return args -> {
			FraudCheckHistory fraud = new FraudCheckHistory(
					1, false, LocalDateTime.now()
			);
			repository.save(fraud);
		};
	}

}