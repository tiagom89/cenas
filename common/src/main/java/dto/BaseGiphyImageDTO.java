package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseGiphyImageDTO {
	
	@JsonProperty("data")
	private GiphyImageDTO data;

	public GiphyImageDTO getData() {
		return data;
	}

}
