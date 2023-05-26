package com.udemy.java_completo_2023_poo.secao008.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao008.exercicios.entities.Rectangle;

public class Exercicio08_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
		System.out.printf("AREA: %.2f", rectangle.area);
		System.out.printf("\nPERIMETER: %.2f", rectangle.perimeter);
		System.out.printf("\nDIAGONAL: %.2f", rectangle.diagonal);
		
		input.close();

	}

}
