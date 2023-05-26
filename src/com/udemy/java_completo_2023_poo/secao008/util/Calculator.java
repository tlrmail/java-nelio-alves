package com.udemy.java_completo_2023_poo.secao008.util;

public class Calculator {

	public final double PI = 3.14159;
	
	public double circunference(double r) {
		return 2 * PI * r;
	}

	public double volume(double r) {
		return 4 * PI * Math.pow(r, 3);
	}
	
}
