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
import enums.ImgurRequestServiceUtils;

@Service
@EnableConfigurationProperties
public class ImgurImageServiceImpl implements BaseImageService{

	@Value("${imgurClientId}")
	private String imgurClientId;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Image getImageById(@NotEmpty String id) {

		try {
			List<Image> responseImage = requestImgurImageById(id);
			if(!responseImage.isEmpty()){
				return responseImage.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		return null;
	}
	
	
	private List<Image> requestImgurImageById(String id) throws Exception{

		Image response = null;
		try{
			
			HttpHeaders headers = this.getImgurHeader();
			//DTO imgur convert to Image
			List<ImgurImageDTO> list = Arrays.asList(
					this.restTemplate.exchange("https://api.imgur.com/3/image/{"+id+"}}",HttpMethod.GET,new HttpEntity<>(headers), ImgurImageDTO[].class).getBody());
				return null;	
		}catch(Exception e){
			throw new Exception("");
		}
		
	}
	
	private HttpHeaders getImgurHeader() throws Exception{
		HttpHeaders headers = null;
		try{
			headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set(ImgurRequestServiceUtils.IMGUR_AUTH_HEADER_AUTH_CLIENT_ID,"imgurClientId");
			return headers;
		}catch(Exception e){
			throw new Exception("");
		}
	}
	

}
