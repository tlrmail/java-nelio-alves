package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

import com.udemy.java_completo_2023_poo.secao018.interfaces.model.enums.Color;

public class Rectangle extends AbstractShape{

	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double width, Double height) {
		super(color);
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
