package com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities;

public class Rectangle implements Shape{

	private Double width;
	private Double height;
	
	public Rectangle() {
	}

	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public Double area() {
		return this.height * this.width;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
}
