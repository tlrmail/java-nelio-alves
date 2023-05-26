package com.udemy.java_completo_2023_poo.secao008.entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

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
