package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * @author: Himanshu
 * @creation date: 1/10/2019
 * @description: hibernate project demo
 */
@Entity
public class Product {
	@Id
	@Column(name = "id")
	private int ProductId;
	private String name;
	private float price;
	private String brand;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
	

}
