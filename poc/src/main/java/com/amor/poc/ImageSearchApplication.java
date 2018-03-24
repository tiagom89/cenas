package com.amor.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import cloud.ImageCloudStream;
import config.CommonsConfiguration;

@SpringBootApplication
@Import(CommonsConfiguration.class)
public class ImageSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageSearchApplication.class, args);
	}
}
