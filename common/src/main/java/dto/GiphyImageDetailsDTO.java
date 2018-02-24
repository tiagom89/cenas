package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GiphyImageDetailsDTO {
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("width")
	private String width;
	
	@JsonProperty("height")
	private String height;	
	
	@JsonProperty("size")
	private String size;
	
	@JsonProperty("mp4")
	private String mp4;
	
	@JsonProperty("mp4_size")
	private String mp4_size;
	
	@JsonProperty("webp")
	private String webp;
	
	@JsonProperty("webp_size")
	private String webp_size;
	
	@JsonProperty("frames")
	private String frames;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMp4() {
		return mp4;
	}
	public void setMp4(String mp4) {
		this.mp4 = mp4;
	}
	public String getMp4_size() {
		return mp4_size;
	}
	public void setMp4_size(String mp4_size) {
		this.mp4_size = mp4_size;
	}
	public String getWebp() {
		return webp;
	}
	public void setWebp(String webp) {
		this.webp = webp;
	}
	public String getWebp_size() {
		return webp_size;
	}
	public void setWebp_size(String webp_size) {
		this.webp_size = webp_size;
	}
	public String getFrames() {
		return frames;
	}
	public void setFrames(String frames) {
		this.frames = frames;
	}


}
