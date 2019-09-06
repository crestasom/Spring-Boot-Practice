package com.crestasom.model;

public class Category {
	private int id;
	private String catName;
	private String catDetails;

	public Category(int id, String catName, String catDetails) {
		super();
		this.id = id;
		this.catName = catName;
		this.catDetails = catDetails;
	}

	public Category(String catName, String catDetails) {

		this.catName = catName;
		this.catDetails = catDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDetails() {
		return catDetails;
	}

	public void setCatDetails(String catDetails) {
		this.catDetails = catDetails;
	}
}
