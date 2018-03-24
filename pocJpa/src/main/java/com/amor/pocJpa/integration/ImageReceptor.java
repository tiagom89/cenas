package com.amor.pocJpa.integration;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;


@Service
public class ImageReceptor {
	
	@StreamListener(ImageCloudStream.INPUT)
	public void receiveImageQueue(Image image){
		System.out.println("Hue " + image.toString());
		
	}
	
	
	
	
	

}
