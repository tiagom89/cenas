package converters;

import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;

import dto.GiphyImageDTO;
import dto.Image;

public class GiphyImageDTOToImageConverter implements Converter<GiphyImageDTO,Image>{

	@Override
	public Image convert(GiphyImageDTO giphyImage) {
		
		return new Image(giphyImage.getTitle(), giphyImage.getUrl());
	}	
}
