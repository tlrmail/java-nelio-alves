package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.enums.Color;

public abstract class Shape {

	private Color color;
	
	public Shape() {

	}

	public abstract Double area();
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	
}
