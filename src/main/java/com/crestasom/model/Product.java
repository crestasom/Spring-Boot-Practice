package com.crestasom.model;

public class Product {
	private int id;
	private String pName;
	private double price;
	private int quantity;
	private Category category;
	public Product(int id, String pName, double price, int quantity, Category category) {
		super();
		this.id = id;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	} 
	
	
	
	

}
