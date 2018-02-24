package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseGiphyImageDTO {
	
	@JsonProperty("data")
	private GiphyImageDTO list;

}
