package com.microsservices.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(
		scanBasePackages = {
				"com.microsservices.notification",
				"com.microsservices.amqp"
		}
)
@PropertySource("classpath:clients-default.properties")
public class NotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

}
