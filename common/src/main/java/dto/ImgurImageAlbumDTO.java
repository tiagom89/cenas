package dto;

import java.util.List;

public class ImgurImageAlbumDTO {
	
	private String id;
	private String title;
	private String description;
	private Integer datetime;
	private String cover;
	private Integer cover_width;
	private int cover_height;
	private String account_url;
	private int account_id;
	private String privacy;
	private String layout;
	private int views;
	private String link;
	private int ups;
	private int downs;
	private int points;
	private int score;
	private boolean is_album;
	private String vote;
	private boolean favorite;
	private boolean nsfw;
	private int comment_count;
	private String topic;
	private int topic_id;
	private int images_count;
	private List<ImgurImageDTO> images;
	private boolean in_most_viral;
	
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
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Integer getCover_width() {
		return cover_width;
	}
	public void setCover_width(Integer cover_width) {
		this.cover_width = cover_width;
	}
	public int getCover_height() {
		return cover_height;
	}
	public void setCover_height(int cover_height) {
		this.cover_height = cover_height;
	}
	public String getAccount_url() {
		return account_url;
	}
	public void setAccount_url(String account_url) {
		this.account_url = account_url;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getUps() {
		return ups;
	}
	public void setUps(int ups) {
		this.ups = ups;
	}
	public int getDowns() {
		return downs;
	}
	public void setDowns(int downs) {
		this.downs = downs;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isIs_album() {
		return is_album;
	}
	public void setIs_album(boolean is_album) {
		this.is_album = is_album;
	}
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public boolean isNsfw() {
		return nsfw;
	}
	public void setNsfw(boolean nsfw) {
		this.nsfw = nsfw;
	}
	public int getComment_count() {
		return comment_count;
	}
	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public int getImages_count() {
		return images_count;
	}
	public void setImages_count(int images_count) {
		this.images_count = images_count;
	}
	public List<ImgurImageDTO> getImages() {
		return images;
	}
	public void setImages(List<ImgurImageDTO> images) {
		this.images = images;
	}
	public boolean isIn_most_viral() {
		return in_most_viral;
	}
	public void setIn_most_viral(boolean in_most_viral) {
		this.in_most_viral = in_most_viral;
	}
	
	
}
