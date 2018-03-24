package com.amor.pocJpa;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

import com.amor.pocJpa.integration.ImageCloudStream;import com.amor.pocJpa.integration.ImageReceptor;

@Configuration
@EnableBinding(ImageCloudStream.class)
public class ImageJpaBaseConfig {

	
}
