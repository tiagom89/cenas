package com.amor.poc.integration;

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

import dto.BaseGiphyImageDTO;
import dto.GiphyImageDTO;
import dto.Image;
import dto.ImgurImageDTO;
import enums.GiphyRequestServiceUtils;
import enums.ImgurRequestServiceUtils;

@Service
@EnableConfigurationProperties
public class GiphyImageServiceImpl implements BaseImageService{

	@Value("${giphyApiKey}")
	private String giphyApiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Image getImageById(@NotEmpty String id) {
		
		try {
			return requestGiphyImageById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Image> getAlbumById(String albumId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> getAccountImagesById(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> getImageByBestOfTheDay() {
		// TODO Auto-generated method stub
		return null;
	}

	/********************************************************************************
	 * Functions
	 * @throws Exception 
	 ********************************************************************************/
	private Image requestGiphyImageById(String gifId) throws Exception {
		Image response = null;
		try{
//			http://api.giphy.com/v1/gifs/
			HttpHeaders headers = this.getGiphyHeader();
			BaseGiphyImageDTO image = 
					this.restTemplate.exchange(GiphyRequestServiceUtils.GIPHY_HOST+GiphyRequestServiceUtils.GIPHY_PATH_GET_GIF_BY_ID+gifId,HttpMethod.GET,new HttpEntity<>(headers),BaseGiphyImageDTO.class).getBody();
			
//			convert
			
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
			headers.set(GiphyRequestServiceUtils.GIPHY_API_KEY_HEADER,this.giphyApiKey);
			return headers;
		}catch(Exception e){
			throw new Exception("");
		}
	}

}
