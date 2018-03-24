package com.amor.pocJpa.integration;

public class Image {

private String name;
private String link;
	
	public Image(String name,String link){
		this.name = name;
		this.link = link;
	}

	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}

	public Image(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
	
