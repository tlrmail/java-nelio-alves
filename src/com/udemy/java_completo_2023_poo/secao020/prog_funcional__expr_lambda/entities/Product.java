package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Product  implements Predicate<Product>, Consumer<Product>{
	
	private String name;
	private Double price;
	
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
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}
	
	public boolean nonStaticProductPredicate() {
		return this.price >= 100;
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticPriceUpdate() {
		this.setPrice(this.getPrice() * 1.1);
	}
	
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}

	public String nonStaticUpperCaseName() {
		return this.getName().toUpperCase();
	}

	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + String.format("%.2f", this.price) + "]";
	}

	@Override
	public void accept(Product p) {
		this.setPrice(p.getPrice() * 1.1);
	}

	@Override
	public boolean test(Product p) {
		return this.price >= 100;
	}
	
	
}
