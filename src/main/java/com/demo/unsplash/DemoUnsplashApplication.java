package com.demo.unsplash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class DemoUnsplashApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoUnsplashApplication.class, args);
	}

}
