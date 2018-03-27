package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseImgurImageDTO {
	
	@JsonProperty("data")
	private ImgurImageDTO imageDTO;

	public ImgurImageDTO getImageDTO() {
		return imageDTO;
	}
	public void setImageDTO(ImgurImageDTO imageDTO) {
		this.imageDTO = imageDTO;
	}

}
