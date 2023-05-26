package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.enums.Color;

public class Rectangle extends Shape{

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
