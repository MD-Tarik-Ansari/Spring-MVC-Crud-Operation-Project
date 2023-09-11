package com.spring.Spring_mvc_crud_operation_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
     private int productId;
     private String productName;
     private double productPrice;
     
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
     
}
