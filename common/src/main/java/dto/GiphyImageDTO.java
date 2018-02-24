package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GiphyImageDTO {
		
	/**********************************************
	 * GIF Object
	 **********************************************/
	@JsonProperty("type")
	private String type = "gif";
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("slug")
	private String slug;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("bitly_url")
	private String bitly_url;
	
	@JsonProperty("embed_url")
	private String embed_url;
	
	@JsonProperty("username")
	private String username;
	
	@JsonProperty("source")
	private String source;
	
	@JsonProperty("rating")
	private String rating;
	
	@JsonProperty("content_url")
	private String content_url;
	
	private GiphyUserDTO user;

	@JsonProperty("source_tld")
	private String source_tld;
	
	@JsonProperty("source_post_url")
	private String source_post_url;
	
	@JsonProperty("update_datetime")
	private String update_datetime;
	
	@JsonProperty("create_datetime")
	private String create_datetime;
	
	@JsonProperty("import_datetime")
	private String import_datetime;
	
	@JsonProperty("trending_datetime")
	private String trending_datetime;
	
	private GiphyImagesDTO images;
	
	@JsonProperty("title")
	private String title;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBitly_url() {
		return bitly_url;
	}

	public void setBitly_url(String bitly_url) {
		this.bitly_url = bitly_url;
	}

	public String getEmbed_url() {
		return embed_url;
	}

	public void setEmbed_url(String embed_url) {
		this.embed_url = embed_url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getContent_url() {
		return content_url;
	}

	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}

	public GiphyUserDTO getUser() {
		return user;
	}

	public void setUser(GiphyUserDTO user) {
		this.user = user;
	}

	public String getSource_tld() {
		return source_tld;
	}

	public void setSource_tld(String source_tld) {
		this.source_tld = source_tld;
	}

	public String getSource_post_url() {
		return source_post_url;
	}

	public void setSource_post_url(String source_post_url) {
		this.source_post_url = source_post_url;
	}

	public String getUpdate_datetime() {
		return update_datetime;
	}

	public void setUpdate_datetime(String update_datetime) {
		this.update_datetime = update_datetime;
	}

	public String getCreate_datetime() {
		return create_datetime;
	}

	public void setCreate_datetime(String create_datetime) {
		this.create_datetime = create_datetime;
	}

	public String getImport_datetime() {
		return import_datetime;
	}

	public void setImport_datetime(String import_datetime) {
		this.import_datetime = import_datetime;
	}

	public String getTrending_datetime() {
		return trending_datetime;
	}

	public void setTrending_datetime(String trending_datetime) {
		this.trending_datetime = trending_datetime;
	}

	public GiphyImagesDTO getImages() {
		return images;
	}

	public void setImages(GiphyImagesDTO images) {
		this.images = images;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
