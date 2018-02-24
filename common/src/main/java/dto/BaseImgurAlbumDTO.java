package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseImgurAlbumDTO {

	@JsonProperty("data")
	private List<ImgurImageDTO> list;
	
}
