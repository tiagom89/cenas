package com.amor.poc.integration;

import java.util.Arrays;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dto.Image;
import dto.ImgurImageDTO;
import dto.ImgurImageDTO23;
import enums.ImgurRequestServiceUtils;

@Service
@EnableConfigurationProperties
public class ImgurImageServiceImpl implements BaseImageService{

	@Value("${imgurClientId}")
	private String imgurClientId;
	
	@Value("${imgurAccessToken}")
	private String imgurAccessToken;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Image getImageById(@NotEmpty String id) {

		try {
			return requestImgurImageById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Image> getAlbumById(@NotEmpty String albumId) {

		try {
			return requestImgurAlbumImages(albumId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Image> getAccountImagesById(String accountId) {
		try {
			return requestImgurAccountImages(accountId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private Image requestImgurImageById(String imageId) throws Exception{

		Image response = null;
		try{
//			https://apidocs.imgur.com/
			HttpHeaders headers = this.getImgurHeader();
			//Lista devolve erro
			//DTO imgur convert to Image
//			List<ImgurImageDTO> list = Arrays.asList(
//					this.restTemplate.exchange("https://api.imgur.com/3/image/"+id+"",HttpMethod.GET,new HttpEntity<>(headers), ImgurImageDTO[].class).getBody());
			ImgurImageDTO image = 
					this.restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL_GET_IMAGE+imageId,HttpMethod.GET,new HttpEntity<>(headers), ImgurImageDTO.class).getBody();
			
//			convert
			
			return null;	
		}catch(Exception e){
			throw new Exception("");
		}
		
	}
	
	private List<Image> requestImgurAlbumImages(String albumId) throws Exception{
		List<Image> imageList= null;
		try{
			List<ImgurImageDTO23> imgurImageDTOList = Arrays.asList(
					this.restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL_GET_ALBUM,HttpMethod.GET,new HttpEntity<>(this.getImgurHeader()), ImgurImageDTO23.class,albumId).getBody());
			
			System.out.println(imgurImageDTOList.toString());
			if(imgurImageDTOList != null){
				
			}
			
		}catch(Exception e){
			throw new Exception("");
		}
		
//		convert
		return imageList;
	}
	
	private List<Image> requestImgurAccountImages(String accountId) throws Exception{
		List<Image> imageList= null;
		try{
			List<ImgurImageDTO> imgurImageDTOList = Arrays.asList(
					this.restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL_GET_IMAGE_ACCOUNT,HttpMethod.GET,new HttpEntity<>(this.getImgurBearerHeader()), ImgurImageDTO.class,accountId).getBody());
			
			System.out.println(imgurImageDTOList.toString());
			if(imgurImageDTOList != null){
				
			}
			
		}catch(Exception e){
			throw new Exception("");
		}
		
//		convert
		return imageList;
	}
	
	@Override
	public List<Image> getImageByBestOfTheDay() {
		List<Image> imageList = null;
		try{
			List<ImgurImageDTO> imgurImageDTOList = Arrays.asList(
					this.restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL_GALLERY_TOP, HttpMethod.GET,new HttpEntity<>(this.getImgurHeader()), ImgurImageDTO.class).getBody()
					);
					
		}catch(Exception e){
			
		}
		
		
		return null;
	}
	
	private HttpHeaders getImgurHeader() throws Exception{
		HttpHeaders headers = null;
		try{
			headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set(ImgurRequestServiceUtils.IMGUR_AUTH_HEADER_AUTH,ImgurRequestServiceUtils.IMGUR_AUTH_HEADER_AUTH_CLIENT_ID+this.imgurClientId);
			return headers;
		}catch(Exception e){
			throw new Exception("");
		}
	}
	
	private HttpHeaders getImgurBearerHeader() throws Exception{
		HttpHeaders headers = null;
		try{
			headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set(ImgurRequestServiceUtils.IMGUR_AUTH_HEADER_AUTH,ImgurRequestServiceUtils.IMGUR_AUTH_HEADER_AUTH_BEARER+this.imgurAccessToken);
			return headers;
		}catch(Exception e){
			throw new Exception("");
		}
	}
	
}
