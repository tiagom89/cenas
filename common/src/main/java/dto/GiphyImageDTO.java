package dto;

public class GiphyImageDTO {

	private class User{
		//URL for this user's avatar image
		private String avatar_url;
		
		//URL for the banner image that appears atop this user's profile page
		private String banner_url;
		
		//URL for this user's profile 
		private String profile_url;
		
		//Username associated with this user
		private String username;
		
		//Display name associated with this user
		private String display_name;
		
		//Twitter username
		private String twitter;
		
		public String getAvatar_url() {
			return avatar_url;
		}

		public void setAvatar_url(String avatar_url) {
			this.avatar_url = avatar_url;
		}

		public String getBanner_url() {
			return banner_url;
		}

		public void setBanner_url(String banner_url) {
			this.banner_url = banner_url;
		}

		public String getProfile_url() {
			return profile_url;
		}

		public void setProfile_url(String profile_url) {
			this.profile_url = profile_url;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getDisplay_name() {
			return display_name;
		}

		public void setDisplay_name(String display_name) {
			this.display_name = display_name;
		}

		public String getTwitter() {
			return twitter;
		}

		public void setTwitter(String twitter) {
			this.twitter = twitter;
		}

	}
	
	private class Images{
		ImageDetails fixed_height;
		ImageDetails fixed_height_still;
		ImageDetails fixed_height_downsampled;
		ImageDetails fixed_width;
		ImageDetails fixed_width_still;
		ImageDetails fixed_width_downsampled;
		ImageDetails fixed_height_small;
		ImageDetails fixed_height_small_still;
		ImageDetails fixed_width_small;
		ImageDetails fixed_width_small_still;
		ImageDetails DimensionSize;
		ImageDetails DimensionSize_still;
		ImageDetails DimensionSize_large;
		ImageDetails DimensionSize_medium;
		ImageDetails DimensionSize_small;
		ImageDetails original;
		ImageDetails origin_still;
		ImageDetails looping;
		ImageDetails preview;
		ImageDetails preview_gif;
		public ImageDetails getFixed_height() {
			return fixed_height;
		}
		public void setFixed_height(ImageDetails fixed_height) {
			this.fixed_height = fixed_height;
		}
		public ImageDetails getFixed_height_still() {
			return fixed_height_still;
		}
		public void setFixed_height_still(ImageDetails fixed_height_still) {
			this.fixed_height_still = fixed_height_still;
		}
		public ImageDetails getFixed_height_downsampled() {
			return fixed_height_downsampled;
		}
		public void setFixed_height_downsampled(ImageDetails fixed_height_downsampled) {
			this.fixed_height_downsampled = fixed_height_downsampled;
		}
		public ImageDetails getFixed_width() {
			return fixed_width;
		}
		public void setFixed_width(ImageDetails fixed_width) {
			this.fixed_width = fixed_width;
		}
		public ImageDetails getFixed_width_still() {
			return fixed_width_still;
		}
		public void setFixed_width_still(ImageDetails fixed_width_still) {
			this.fixed_width_still = fixed_width_still;
		}
		public ImageDetails getFixed_width_downsampled() {
			return fixed_width_downsampled;
		}
		public void setFixed_width_downsampled(ImageDetails fixed_width_downsampled) {
			this.fixed_width_downsampled = fixed_width_downsampled;
		}
		public ImageDetails getFixed_height_small() {
			return fixed_height_small;
		}
		public void setFixed_height_small(ImageDetails fixed_height_small) {
			this.fixed_height_small = fixed_height_small;
		}
		public ImageDetails getFixed_height_small_still() {
			return fixed_height_small_still;
		}
		public void setFixed_height_small_still(ImageDetails fixed_height_small_still) {
			this.fixed_height_small_still = fixed_height_small_still;
		}
		public ImageDetails getFixed_width_small() {
			return fixed_width_small;
		}
		public void setFixed_width_small(ImageDetails fixed_width_small) {
			this.fixed_width_small = fixed_width_small;
		}
		public ImageDetails getFixed_width_small_still() {
			return fixed_width_small_still;
		}
		public void setFixed_width_small_still(ImageDetails fixed_width_small_still) {
			this.fixed_width_small_still = fixed_width_small_still;
		}
		public ImageDetails getDimensionSize() {
			return DimensionSize;
		}
		public void setDimensionSize(ImageDetails dimensionSize) {
			DimensionSize = dimensionSize;
		}
		public ImageDetails getDimensionSize_still() {
			return DimensionSize_still;
		}
		public void setDimensionSize_still(ImageDetails dimensionSize_still) {
			DimensionSize_still = dimensionSize_still;
		}
		public ImageDetails getDimensionSize_large() {
			return DimensionSize_large;
		}
		public void setDimensionSize_large(ImageDetails dimensionSize_large) {
			DimensionSize_large = dimensionSize_large;
		}
		public ImageDetails getDimensionSize_medium() {
			return DimensionSize_medium;
		}
		public void setDimensionSize_medium(ImageDetails dimensionSize_medium) {
			DimensionSize_medium = dimensionSize_medium;
		}
		public ImageDetails getDimensionSize_small() {
			return DimensionSize_small;
		}
		public void setDimensionSize_small(ImageDetails dimensionSize_small) {
			DimensionSize_small = dimensionSize_small;
		}
		public ImageDetails getOriginal() {
			return original;
		}
		public void setOriginal(ImageDetails original) {
			this.original = original;
		}
		public ImageDetails getOrigin_still() {
			return origin_still;
		}
		public void setOrigin_still(ImageDetails origin_still) {
			this.origin_still = origin_still;
		}
		public ImageDetails getLooping() {
			return looping;
		}
		public void setLooping(ImageDetails looping) {
			this.looping = looping;
		}
		public ImageDetails getPreview() {
			return preview;
		}
		public void setPreview(ImageDetails preview) {
			this.preview = preview;
		}
		public ImageDetails getPreview_gif() {
			return preview_gif;
		}
		public void setPreview_gif(ImageDetails preview_gif) {
			this.preview_gif = preview_gif;
		}
	}
	
	private class ImageDetails{
		private String url;
		private String width;
		private String height;	
		private String size;
		private String mp4;
		private String mp4_size;
		private String webp;
		private String webp_size;
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
		
	/**********************************************
	 * GIF Object
	 **********************************************/
	//By default, this is almost always gif
	private String type = "gif";
	
	//GIF's unique ID
	private String id;
	
	//Unique slug used in this GIF's URL
	private String slug;
	
	//Unique URL for this GIF
	private String url;
	
	//Unique bit.ly URL for this GIF
	private String bitly_url;
	
	//URL used for embedding this GIF
	private String embed_url;
	
	//Username this GIF is attached to, if applicable
	private String username;
	
	//Page on which this GIF was found
	private String source;
	
	//MPAA-style rating for this content (Y,G,PG,PG-13 and R).
	private String rating;
	
	//Currently unused
	private String content_url;
	
	//Object Containing data about the user associated with this GIF, if applicable
	private User user;

	//Top level domain of the source URL
	private String source_tld;
	
	//URL of the webpage on which this GIF was found
	private String source_post_url;
	
	//Date on which this GIF was last updated
	private String update_datetime;
	
	//Date this GIF was added to the GIPHY database
	private String create_datetime;
	
	//Creation or upload date from this GIF's source
	private String import_datetime;
	
	//Date on which this gif was marked trending
	private String trending_datetime;
	
	//Object containing data for various available formats and sizes of this GIF
	private Images images;
	
	//Title that appears on giphy.com for this GIF
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
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

	public Images getImages() {
		return images;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
