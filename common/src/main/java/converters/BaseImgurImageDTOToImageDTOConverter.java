package converters;

import org.springframework.core.convert.converter.Converter;

import dto.BaseImgurImageDTO;
import dto.ImageDTO;

public class BaseImgurImageDTOToImageDTOConverter implements Converter<BaseImgurImageDTO,ImageDTO>{

	@Override
	public ImageDTO convert(BaseImgurImageDTO baseImage) {
		
		return new ImageDTO(baseImage.getImageDTO().getName(),baseImage.getImageDTO().getLink());
	}

}
