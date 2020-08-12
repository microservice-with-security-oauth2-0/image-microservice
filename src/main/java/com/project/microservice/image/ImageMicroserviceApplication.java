package com.project.microservice.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImageMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageMicroserviceApplication.class, args);
	}

}
