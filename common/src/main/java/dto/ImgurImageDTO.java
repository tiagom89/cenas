package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImgurImageDTO {

	@JsonProperty("id")
	private String id;
//	private String title;
//	private String description;
//	private Integer datetime;
//	private String type;
//	private Boolean animated;
//	private Integer width;
//	private Integer height;
//	private Integer size;
//	private Integer views;
//	private Integer bandwidth;
//	private String deletehash;
//	private String name;
//	private String section;
//	private String link;
//	private String gifv;
//	private String mp4;
//	private Integer mp4_size;
//	private Boolean looping;
//	private Boolean favorite;
//	private Boolean nsfw;
//	private String vote;
//	private Boolean in_gallery;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
