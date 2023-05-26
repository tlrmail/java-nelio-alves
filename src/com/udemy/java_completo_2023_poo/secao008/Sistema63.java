package com.udemy.java_completo_2023_poo.secao008;

import java.util.Locale;
import java.util.Scanner;

public class Sistema63 {

	public static void main(String[] args) {

		double xA, xB, xC, xArea;
		double yA, yB, yC, yArea;

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the measures of triangles X: ");
		xA = input.nextDouble();
		xB = input.nextDouble();
		xC = input.nextDouble();
		xArea = Sistema63.area(xA, xB, xC);
		
		System.out.println("Enter the measures of triangles Y: ");
		yA = input.nextDouble();
		yB = input.nextDouble();
		yC = input.nextDouble();
		yArea = Sistema63.area(yA, yB, yC);
		
		String resultado = (xArea > yArea) ? "Large area is X." : "Large area is Y" ;
		
		System.out.println(resultado);
		
		input.close();

	}

	public static double area(double a, double b, double c) {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
