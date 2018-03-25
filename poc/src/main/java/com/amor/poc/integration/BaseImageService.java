package com.amor.poc.integration;

import java.util.List;

import dto.ImageDTO;

public interface BaseImageService<T> {
	
	public ImageDTO getImageById(String imageId) throws Exception; 

	public List<T> getImageByBestOfTheDay();
	
	public List<T> getAlbumById(String albumId) throws Exception;
	
	public List<T> getAccountImagesById(String accountId);

}
