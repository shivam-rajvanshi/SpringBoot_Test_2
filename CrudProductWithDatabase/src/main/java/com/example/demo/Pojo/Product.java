package com.example.demo.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name, category, price;


	
	public Product(String name, String category, String price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public Product() {
		super();
	}
	



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

	
	
	
}
