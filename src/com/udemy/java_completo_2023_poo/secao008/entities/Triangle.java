package com.udemy.java_completo_2023_poo.secao008.entities;

public class Triangle {

	private double a;
	private double b;
	private double c;
	private double area;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void calcularArea() {
		double p = (a + b + c) / 2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public double getArea() {
		return this.area;
	}
	
}
