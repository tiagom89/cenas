package com.amor.poc.integration;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dto.BaseGiphyImageDTO;
import dto.GiphyImageDTO;
import dto.ImageDTO;
import dto.ImgurImageDTO;
import enums.GiphyRequestServiceUtils;
import enums.ImgurRequestServiceUtils;
import enums.ServiceProviders;

@Service
@EnableConfigurationProperties
public class GiphyImageServiceImpl implements BaseImageService{

	@Value("${giphyApiKey}")
	private String giphyApiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ConversionService conversionService;
	
	@Override

	public ImageDTO getImageById(@NotEmpty String id) throws Exception {
		
		try {
			
			ImageDTO image = requestGiphyImageById(id);
			
			image.setService(ServiceProviders.GIPHY.toString());
			
			return image;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("GiphyImageServiceImpl - getImageById - Erro ao obter imagem. pelo id pedido.");
		}
		
	}

	@Override
	public List<ImageDTO> getAlbumById(String albumId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageDTO> getAccountImagesById(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageDTO> getImageByBestOfTheDay() {
		// TODO Auto-generated method stub
		return null;
	}

	/********************************************************************************
	 * Functions
	 * @throws Exception 
	 ********************************************************************************/
	private ImageDTO requestGiphyImageById(String gifId) throws Exception {
		try{
//			http://api.giphy.com/v1/gifs/
			HttpHeaders headers = this.getGiphyHeader();
			BaseGiphyImageDTO giphyImage = 
					this.restTemplate.exchange(GiphyRequestServiceUtils.GIPHY_HOST+GiphyRequestServiceUtils.GIPHY_PATH_GET_GIF_BY_ID+gifId,HttpMethod.GET,new HttpEntity<>(headers),BaseGiphyImageDTO.class).getBody();

//			convert
			return this.conversionService.convert(giphyImage.getData(),ImageDTO.class);
				
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
