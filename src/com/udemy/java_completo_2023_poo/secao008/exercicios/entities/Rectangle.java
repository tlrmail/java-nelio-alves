package com.udemy.java_completo_2023_poo.secao008.exercicios.entities;

public class Rectangle {

	public double width; 
	public double height;
	public double area;
	public double perimeter;
	public double diagonal;

	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.calcularArea();
		this.calcularPerimeter();
		this.calcularDiagonal();
	}

	private void calcularPerimeter() {
		this.perimeter = (this.width + this.height) * 2;
	}
	
	private void calcularArea() {
		this.area = this.width * this.height;
	}
	
	private void calcularDiagonal() {
		this.diagonal = Math.sqrt((Math.pow(this.width, 2) + Math.pow(this.height, 2)));  
	}
	
}
