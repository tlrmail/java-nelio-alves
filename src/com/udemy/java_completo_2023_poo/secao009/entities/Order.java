package com.udemy.java_completo_2023_poo.secao009.entities;

import java.util.Date;

public class Order {

	private Date date;
	private Product product;
	
	public Order(Date date, Product product) {
		this.date = date;
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
