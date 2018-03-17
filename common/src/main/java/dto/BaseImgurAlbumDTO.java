package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import dto.ImgurImageDTO;

/**
 * 
 * Objecto que contem todas as imagens de um album imgur
 * 
 * @author Tiaog
 *
 */
public class BaseImgurAlbumDTO {

	public List<ImgurImageDTO> getList() {
		return list;
	}

	public void setList(List<ImgurImageDTO> list) {
		this.list = list;
	}

	@JsonProperty("data")
	private List<ImgurImageDTO> list;
	
}
