package com.udemy.java_completo_2023_poo.secao009.entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double totalValueStock() {
		return this.price * this.quantity;
	}

	public void addProduct(int quantity) {
		this.quantity += quantity;
	}

	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "Product data: " + this.name + ", $" + String.format("%.2f",this.price) + "," + this.quantity + " units, total: $"
				+ String.format("%.2f", this.totalValueStock());
	}

}
