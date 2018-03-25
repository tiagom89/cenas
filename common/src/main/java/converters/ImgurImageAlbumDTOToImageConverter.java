package converters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;

import dto.ImageDTO;
import dto.ImgurImageAlbumDTO;

public class ImgurImageAlbumDTOToImageConverter implements Converter<ImgurImageAlbumDTO,List<ImageDTO>>{

	/**
	 * 
	 * Converte para uma lista de imagens recebendo um objecto imgur album, que contem varias imagens imgur (ImgurImageDTO)
	 * 
	 */
	public List<ImageDTO> convert(ImgurImageAlbumDTO imgurImage) {
		
		List<ImageDTO> imageList = imgurImage.getImages().stream().map(
				image -> new ImageDTO(image.getName(),image.getLink())
		).collect(Collectors.toList()); 

		return imageList;
	}

	
	
	
}
