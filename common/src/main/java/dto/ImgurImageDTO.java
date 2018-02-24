package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImgurImageDTO {

	@JsonProperty("id")
	private String id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
	@JsonProperty("datetime")
	private Integer datetime;
	@JsonProperty("type")
	private String type;
	@JsonProperty("animated")
	private Boolean animated;
	@JsonProperty("width")
	private Integer width;
	@JsonProperty("height")
	private Integer height;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("views")
	private Integer views;
	@JsonProperty("bandwidth")
	private Double bandwidth;
	@JsonProperty("deletehash")
	private String deletehash;
	@JsonProperty("name")
	private String name;
	@JsonProperty("section")
	private String section;
	@JsonProperty("link")
	private String link;
	@JsonProperty("gifv")
	private String gifv;
	@JsonProperty("mp4")
	private String mp4;
	@JsonProperty("mp4_size")
	private Integer mp4_size;
	@JsonProperty("looping")
	private Boolean looping;
	@JsonProperty("favorite")
	private Boolean favorite;
	@JsonProperty("nsfw")
	private Boolean nsfw;
	@JsonProperty("vote")
	private String vote;
	@JsonProperty("in_gallery")
	private Boolean in_gallery;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDatetime() {
		return datetime;
	}
	public void setDatetime(Integer datetime) {
		this.datetime = datetime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getAnimated() {
		return animated;
	}
	public void setAnimated(Boolean animated) {
		this.animated = animated;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Double getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(Double bandwidth) {
		this.bandwidth = bandwidth;
	}
	public String getDeletehash() {
		return deletehash;
	}
	public void setDeletehash(String deletehash) {
		this.deletehash = deletehash;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getGifv() {
		return gifv;
	}
	public void setGifv(String gifv) {
		this.gifv = gifv;
	}
	public String getMp4() {
		return mp4;
	}
	public void setMp4(String mp4) {
		this.mp4 = mp4;
	}
	public Integer getMp4_size() {
		return mp4_size;
	}
	public void setMp4_size(Integer mp4_size) {
		this.mp4_size = mp4_size;
	}
	public Boolean getLooping() {
		return looping;
	}
	public void setLooping(Boolean looping) {
		this.looping = looping;
	}
	public Boolean getFavorite() {
		return favorite;
	}
	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}
	public Boolean getNsfw() {
		return nsfw;
	}
	public void setNsfw(Boolean nsfw) {
		this.nsfw = nsfw;
	}
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	public Boolean getIn_gallery() {
		return in_gallery;
	}
	public void setIn_gallery(Boolean in_gallery) {
		this.in_gallery = in_gallery;
	}
}
