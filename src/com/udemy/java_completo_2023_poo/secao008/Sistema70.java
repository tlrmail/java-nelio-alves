package com.udemy.java_completo_2023_poo.secao008;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao008.util.Calculator;

public class Sistema70 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = input.nextDouble();

		Calculator calculator = new Calculator();
		
		double c = calculator.circunference(radius);

		double v = calculator.volume(radius);

		System.out.printf("Circurference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI: %.5f",calculator.PI);
		
		input.close();

	}

}
