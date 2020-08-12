package com.project.microservice.image.entity;

public class Image {

	private Integer id;
	private String title, url;

	public Image(Integer id, String title, String url) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
