package com.amor.poc.integration;

import java.util.List;

import dto.Image;

public interface BaseImageService {
	
	public Image getImageById(String imageId); 

	public List<Image> getImageByBestOfTheDay();
	
	public List<Image> getAlbumById(String albumId);
	
	public List<Image> getAccountImagesById(String accountId);

}
