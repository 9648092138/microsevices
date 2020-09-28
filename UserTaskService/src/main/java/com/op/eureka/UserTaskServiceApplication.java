package com.op.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserTaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserTaskServiceApplication.class, args);
	}

}
