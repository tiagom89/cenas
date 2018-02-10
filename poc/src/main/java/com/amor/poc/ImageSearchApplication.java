package com.amor.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ImageSearchBaseConfig.class)
public class ImageSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageSearchApplication.class, args);
	}
}
