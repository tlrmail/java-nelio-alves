package com.udemy.java_completo_2023_poo.secao008.util;

public class CalculatorStatic {

	public static final double PI = 3.14159;
	
	public static double circunference(double r) {
		return 2 * PI * r;
	}

	public static double volume(double r) {
		return 4 * PI * Math.pow(r, 3);
	}
}
