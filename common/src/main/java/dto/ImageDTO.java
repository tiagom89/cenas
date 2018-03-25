package dto;

import org.hibernate.validator.constraints.NotEmpty;

public class ImageDTO {

private String name;
private String link;
private String service;
	
	public ImageDTO(@NotEmpty String name,@NotEmpty String link){
		this.name = name;
		this.link = link;
	}
	
	public ImageDTO(@NotEmpty String name, @NotEmpty String link, @NotEmpty String service){
		this.name = name;
		this.link = link;
		this.service = service;
	}

	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}

	public ImageDTO(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
	
