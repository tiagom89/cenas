package com.amor.poc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amor.poc.integration.BaseImageService;
import com.amor.poc.integration.ImgurImageServiceImpl;

import dto.Image;


/**
 * Base endpoint to request web image from various websites, imgur, instagram, etc
 * 
 * @author Tiago
 *
 */
@RestController(value="/baseImageController")
public class BaseImageController {

	@Autowired
	private ImgurImageServiceImpl imgurImageService;
	
	@GetMapping(value="/imageId")
	public Image getImageId(String id){
		//No request tem de vir qual é o serviço(imgur, giphy) a usar
		this.imgurImageService.getImageById(id);
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
