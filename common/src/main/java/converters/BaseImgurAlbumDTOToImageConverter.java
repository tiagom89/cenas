package converters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;

import dto.BaseImgurAlbumDTO;
import dto.Image;
import dto.ImageList;

public class BaseImgurAlbumDTOToImageConverter implements Converter<BaseImgurAlbumDTO,ImageList>{

	@Override
	public ImageList convert(BaseImgurAlbumDTO album) {
		
		List<Image> convertedImage = album.getList().stream().map(
				image -> new Image(image.getName(),image.getLink())
		).collect(Collectors.toList());
		
		ImageList imageList = new ImageList();
		imageList.setImageList(convertedImage);
		
		return imageList;
	}

}
