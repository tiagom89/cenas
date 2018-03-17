package converters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;

import dto.Image;
import dto.ImgurImageAlbumDTO;

public class ImgurImageAlbumDTOToImageConverter implements Converter<ImgurImageAlbumDTO,List<Image>>{

	/**
	 * 
	 * Converte para uma lista de imagens recebendo um objecto imgur album, que contem varias imagens imgur (ImgurImageDTO)
	 * 
	 */
	public List<Image> convert(ImgurImageAlbumDTO imgurImage) {
		
		List<Image> imageList = imgurImage.getImages().stream().map(
				image -> new Image(image.getName(),image.getLink())
		).collect(Collectors.toList()); 

		return imageList;
	}

	
	
	
}
