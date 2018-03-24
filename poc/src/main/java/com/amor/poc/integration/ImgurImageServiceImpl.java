package com.amor.poc.integration;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;

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

import dto.BaseImgurAlbumDTO;
import dto.BaseImgurImageDTO;
import dto.Image;
import dto.ImageList;
import dto.ImgurImageAlbumDTO;
import dto.ImgurImageDTO;
import enums.ImgurRequestServiceUtils;
import enums.ServiceProviders;
import repository.ImageRepository;

@Service
@EnableConfigurationProperties
public class ImgurImageServiceImpl implements BaseImageService{

	@Value("${imgurClientId}")
	private String imgurClientId;
	
	@Value("${imgurAccessToken}")
	private String imgurAccessToken;
	
	@Autowired
	private ImageRepository imageRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ConversionService conversionService;
	
	@Override
	public Image getImageById(@NotEmpty String id) {

		try {
			return requestImgurImageById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Obtem as imagens imgur e convertas em imagens do nosso sistema
	 * @throws Exception 
	 * 
	 */
	@Override
	public @NotNull List<Image> getAlbumById(@NotEmpty String albumId) throws Exception {

		try {
			BaseImgurAlbumDTO baseImgurAlbumList = requestImgurAlbumImages(albumId);
			
			ImageList imageList = conversionService.convert(baseImgurAlbumList,ImageList.class);
			
			imageList.getImageList().stream().forEach( image -> image.setService(ServiceProviders.IMGUR.toString()));
			
			return imageList.getImageList();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("ImgurImageServiceImpl - getAlbumById - Erro ao obter lista de imagens do album imgur");
		}
	
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
			BaseImgurImageDTO image = 
					this.restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL_GET_IMAGE+imageId,HttpMethod.GET,new HttpEntity<>(headers), BaseImgurImageDTO.class).getBody();
			
//			convert
			
			return null;	
		}catch(Exception e){
			throw new Exception("");
		}
		
	}
	
	/**
	 * 
	 * Metodo que retorna todas a imagens num dado Album imgur
	 * 
	 * 
	 * @param albumId
	 * @return
	 * @throws Exception
	 */
	private @NotNull BaseImgurAlbumDTO requestImgurAlbumImages(String albumId) throws Exception{
		BaseImgurAlbumDTO imgurAlbumList= null;
		try{
			imgurAlbumList =
					this.restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL_GET_ALBUM,HttpMethod.GET,new HttpEntity<>(this.getImgurHeader()), BaseImgurAlbumDTO.class,albumId).getBody();
		}catch(Exception e){
			throw new Exception("ImgurImageService - requestImgurAlbumImages() - Erro ao executar RestTemplate para album",e);
		}
		return imgurAlbumList;
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
		List<ImgurImageAlbumDTO> imgurImageDTOList = null;
		try{
			imgurImageDTOList = Arrays.asList(
					this.restTemplate.exchange(ImgurRequestServiceUtils.IMGUR_REQUEST_URL_GALLERY_TOP, HttpMethod.GET,new HttpEntity<>(this.getImgurHeader()), ImgurImageAlbumDTO.class).getBody()
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
