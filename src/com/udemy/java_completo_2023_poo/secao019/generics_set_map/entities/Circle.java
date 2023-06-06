package com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities;


public class Circle implements Shape{

	private Double radius;
	private Double PI = 3.14;
	
	public Circle() {
	}

	public Circle(Double radius) {
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
