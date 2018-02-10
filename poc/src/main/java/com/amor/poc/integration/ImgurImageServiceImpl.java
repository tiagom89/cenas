package com.amor.poc.integration;

import java.util.Arrays;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import dto.Image;
import enums.ImgurRequestServiceUtils;

public class ImgurImageServiceImpl implements BaseImageService{

	@Override
	public Image getImageById(@NotEmpty String id) {

//		TODO
//		https://stackoverflow.com/questions/19238715/how-to-set-an-accept-header-on-spring-resttemplate-request
//		https://apidocs.imgur.com/#6e2e7363-db44-7435-07de-82fd1e168c28
		try {
			List<Image> responseImage = requestImgurImageById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		return null;
	}
	
	
	private List<Image> requestImgurImageById(String id) throws Exception{

		Image response = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = this.getImgurHeader();
			return Arrays.asList(
					restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL,HttpMethod.GET,new HttpEntity<>(headers), Image[].class).getBody());
					
		}catch(Exception e){
			throw new Exception("");
		}
		
	}
	
	private HttpHeaders getImgurHeader() throws Exception{
		HttpHeaders headers = null;
		try{
			headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set(ImgurRequestServiceUtils.IMGUR_AUTH_HEADER,"");
		}catch(Exception e){
			throw new Exception("");
		}
		
		return headers;
		
	}
	

}
