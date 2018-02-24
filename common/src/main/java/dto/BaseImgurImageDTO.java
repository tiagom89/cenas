package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseImgurImageDTO {
	
	@JsonProperty("data")
	private ImgurImageDTO list;

}
