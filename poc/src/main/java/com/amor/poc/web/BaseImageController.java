package com.amor.poc.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Image;


/**
 * Base endpoint to request web image from various websites, imgur, instagram, etc
 * 
 * @author Tiago
 *
 */
@RestController(value="/baseImageController")
public class BaseImageController {

	@GetMapping(value="/imageId")
	public Image getImageId(int id){
		return null;
	}
	
	@GetMapping(value="/listImageByUserId")
	public List<Image> getListImageByUserId(int userId){
		return null;
	}
	
	@PostMapping(value="/registerNewUser")
	public void registerNewUser(String username){
		
	}
	
}
