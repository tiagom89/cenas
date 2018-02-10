package com.amor.poc.integration;

import java.util.Arrays;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import dto.GiphyImageDTO;
import dto.Image;
import enums.GiphyRequestServiceUtils;
import enums.ImgurRequestServiceUtils;

public class GiphyImageServiceImpl implements BaseImageService{

	@Value("${giphyAPIkey}")
	private String giphyAPIkey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Image getImageById(@NotEmpty String id) {

		try {
			List<Image> responseImage = requestGiphyImageById(id);
			if(!responseImage.isEmpty()){
				return responseImage.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		return null;
	}
	
	
	private List<Image> requestGiphyImageById(String id) throws Exception{

		Image response = null;
		try{
			
			HttpHeaders headers = this.getGiphyHeader();
			//DTO Giphy convert to Image
			List<GiphyImageDTO> list = Arrays.asList(
					this.restTemplate.exchange("http://api.giphy.com/v1/gifs/{"+id+"}}",HttpMethod.GET,new HttpEntity<>(headers), GiphyImageDTO[].class).getBody());
				
			//TODO: convert list GiphyImageDTO to a list of Image.
			
			return null;	
		}catch(Exception e){
			throw new Exception("");
		}
		
	}
	
	private HttpHeaders getGiphyHeader() throws Exception{
		HttpHeaders headers = null;
		try{
			headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set(GiphyRequestServiceUtils.GIPHY_AUTH_HEADER_AUTH_API_KEY,giphyAPIkey);
			return headers;
		}catch(Exception e){
			throw new Exception("");
		}
	}

}
