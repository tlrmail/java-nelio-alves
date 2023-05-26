package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

public class Product {

	private String name;
	protected Double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String priceTag() {
		return String.format("%.2f", this.price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.name + ", $" + this.price;
	}
	
}
