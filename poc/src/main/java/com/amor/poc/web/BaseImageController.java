package com.amor.poc.web;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

import com.amor.poc.integration.GiphyImageServiceImpl;
import com.amor.poc.integration.ImgurImageServiceImpl;

import cloud.ImageCloudStream;
import dto.ImageDTO;
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
	
	@Autowired
	private ImageCloudStream source;
	
	/**
	 * 
	 * Endpoint para receber uma imagem
	 * 
	 * @param imageId
	 * @return
	 */
	@GetMapping(value="/imageId")
	public ImageDTO getImageById(@RequestParam String imageId){
		//No request tem de vir qual é o serviço(imgur, giphy) a usar
		ImageDTO image;
		try {
			image = this.imgurImageService.getImageById(imageId);
			sendMessage(image);
			return image;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@GetMapping(value="/gallery")
	public List<ImageDTO> getGallery(){
		
		
		
		
		return null;
		
	}
	
	@GetMapping(value="/gifId")
	public ImageDTO getGifById(@RequestParam String gifId){
		
		ImageDTO image = null;
		try {
			image = this.giphyImageService.getImageById(gifId);
			
			//sending image to rabbit queue
			sendMessage(image);
			
			return image;	
		}catch (Exception e) {
			//Log de erro
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	/**
	 * Endpoint para receber todas as imagens de um certo album
	 * 
	 * Postman endpoint test http://localhost:8080/albumId?albumId=j1GaT
	 * 
	 * @param albumId
	 * @return
	 */
	@GetMapping(value="/albumId")
	public List<ImageDTO> getAlbumById(@RequestParam String albumId){
		//No request tem de vir qual é o serviço(imgur, giphy) a usar
		List<ImageDTO> listaImagens = null;
		try {
			listaImagens = this.imgurImageService.getAlbumById(albumId);
			listaImagens.stream().forEach( image->{
				sendMessage(image);
			});
			return listaImagens;
			//envio para queue
		} catch (Exception e) {
			//Log de erro
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Send image to exchange
	 */
	private void sendMessage(ImageDTO imgurImage){
		this.source.sendImgurImages().send(MessageBuilder.withPayload(imgurImage).build());
	}
	
	@GetMapping(value="/accountId")
	public ImageDTO getAccountImagesById(@RequestParam String accountId){
		//No request tem de vir qual é o serviço(imgur, giphy) a usar
		ImageDTO listaImagens = null;
		try{
			listaImagens = this.imgurImageService.getImageById(accountId);
			
		}catch(Exception e){
			
		}
		return listaImagens;
	}
	
	@GetMapping(value="/listImageByUserId")
	public List<ImageDTO> getListImageByUserId(int userId){
		return null;
	}
	
	@GetMapping(value="/listBestOfToday")
	public List<ImageDTO> getListBestOfToday(/*@RequestParam String[] services*/){
		
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
