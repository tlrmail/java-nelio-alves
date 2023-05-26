package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
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
	
	
	
}
