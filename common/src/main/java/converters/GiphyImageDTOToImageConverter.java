package converters;

import org.springframework.core.convert.converter.Converter;

import dto.GiphyImageDTO;
import dto.ImageDTO;

public class GiphyImageDTOToImageConverter implements Converter<GiphyImageDTO,ImageDTO>{

	@Override
	public ImageDTO convert(GiphyImageDTO giphyImage) {
		
		return new ImageDTO(giphyImage.getTitle(), giphyImage.getUrl());
	}	
}
