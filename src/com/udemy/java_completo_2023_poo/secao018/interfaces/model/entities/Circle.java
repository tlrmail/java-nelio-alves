package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

import com.udemy.java_completo_2023_poo.secao018.interfaces.model.enums.Color;

public class Circle extends AbstractShape{

	private Double radius;
	private Double PI = 3.14;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.pow(radius, 2) * 3.14;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	
	
}
