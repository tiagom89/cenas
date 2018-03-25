package com.amor.pocJpa.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repository.ImageRepository;
import dto.ImageDTO;
import entity.Image;

@Service
public class ImageReceptor {

	@Autowired
	private ImageRepository imageRepository;
	
	@StreamListener(ImageCloudStream.INPUT)
	public void receiveImageQueue(ImageDTO imageDTO){
		System.out.println("Hue " + imageDTO.getName() + " HueLink: " + imageDTO.getLink() + " HueServiço: " + imageDTO.getService());
		Image image = new Image();
		image.setName(imageDTO.getName());
		image.setLink(imageDTO.getLink());
		image.setService(imageDTO.getService());
		imageRepository.save(image);
		System.out.println("Hue " + image.getName() + " HueLink: " + image.getLink() + " HueServiço: " + image.getService());
	}
	
	
	
	
	

}
