package com.udemy.java_completo_2023_poo.secao008.util;

public class CurrencyConverter {

	public static final double IOF = 1.06;
	
	public static double calcularImposto(double value) {
		return value * IOF;
	}
}
