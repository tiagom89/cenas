package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import dto.ImgurImageDTO;

public class BaseImgurAlbumDTO {

	@JsonProperty("data")
	private List<ImgurImageDTO> list;
	
}
