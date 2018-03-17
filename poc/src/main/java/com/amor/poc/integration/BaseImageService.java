package com.amor.poc.integration;

import java.util.List;

import dto.Image;

public interface BaseImageService<T> {
	
	public Image getImageById(String imageId); 

	public List<T> getImageByBestOfTheDay();
	
	public List<T> getAlbumById(String albumId) throws Exception;
	
	public List<T> getAccountImagesById(String accountId);

}
