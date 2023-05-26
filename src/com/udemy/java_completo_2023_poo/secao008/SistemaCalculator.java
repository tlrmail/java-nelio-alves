package com.udemy.java_completo_2023_poo.secao008;

import java.util.Locale;
import java.util.Scanner;

public class SistemaCalculator {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = input.nextDouble();

		double c = circunference(radius);

		double v = volume(radius);

		System.out.printf("Circurference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI: %.5f",PI);
		
		input.close();

	}

	public static double circunference(double r) {
		return 2 * PI * r;
	}

	public static double volume(double r) {
		return 4 * PI * Math.pow(r, 3);
	}
}
