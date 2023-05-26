package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.enums.Color;

public class Circle extends Shape{

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
