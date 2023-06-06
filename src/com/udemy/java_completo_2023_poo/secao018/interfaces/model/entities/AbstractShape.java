package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

import com.udemy.java_completo_2023_poo.secao018.interfaces.model.enums.Color;

public abstract class AbstractShape implements Shape {

	private Color color;
	
	public AbstractShape() {

	}

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	
}
