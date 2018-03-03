package com.amor.poc.web;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

import com.amor.poc.integration.GiphyImageServiceImpl;
import com.amor.poc.integration.ImgurImageServiceImpl;

import dto.Image;
import enums.ServiceProviders;

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
	
	@Autowired
	private GiphyImageServiceImpl giphyImageService;
	
	
	@GetMapping(value="/imageId")
	public Image getImageById(@RequestParam String imageId){
		//No request tem de vir qual é o serviço(imgur, giphy) a usar
		this.imgurImageService.getImageById(imageId);
		return null;
	}
	
	@GetMapping(value="/gifId")
	public Image getGifById(@RequestParam String gifId){
		return this.giphyImageService.getImageById(gifId);
	}
	
	@GetMapping(value="/albumId")
	public List<Image> getAlbumById(@RequestParam String albumId){
		//No request tem de vir qual é o serviço(imgur, giphy) a usar
		this.imgurImageService.getAlbumById(albumId);
		return null;
	}
	
	@GetMapping(value="/accountId")
	public List<Image> getAccountImagesById(@RequestParam String accountId){
		this.imgurImageService.getAccountImagesById(accountId);
		return null;
	}
	
	@GetMapping(value="/listImageByUserId")
	public List<Image> getListImageByUserId(int userId){
		return null;
	}
	
	@GetMapping(value="/listBestOfToday")
	public List<Image> getListBestOfToday(/*@RequestParam String[] services*/){
		
		//Until we received the target services
		String[] list = new String[2];
		list[0] = "IMGUR";
		list[1] = "GIPHY";
		//
		
		List<ServiceProviders> services = getEnumValue(list,ServiceProviders.class);
		if(!services.isEmpty()){
			services.parallelStream().forEach(service ->{
				if(service == ServiceProviders.IMGUR){
					this.imgurImageService.getImageByBestOfTheDay();
				}else if(service == ServiceProviders.GIPHY){
					//TODO
				}else{
					//TODO
					//throw new Exception("");
				}
			});
		}else{
			
		}
		
		return null;
	}
	
	@PostMapping(value="/registerNewUser")
	public void registerNewUser(String username){
		
	}
	private Object getEnumValue(String travelMode, Class<?> enumClass){
		Optional<?> value = Arrays.stream(enumClass.getEnumConstants()).filter(enumValue -> ((Enum) enumValue).name().equalsIgnoreCase(travelMode)).findFirst();
		return value.isPresent() ? value.get() : null;
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private <T> List<T> getEnumValue(String[] enumValues, Class<T> enumClass){
		if(enumValues == null){
			return emptyList();
		}
	
		return (List<T>)Arrays.stream(enumValues).map(value-> getEnumValue(value,enumClass)).collect(toList());
	}
	
}
