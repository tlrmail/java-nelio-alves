package com.udemy.java_completo_2023_poo.secao004.exercicios;

import java.util.Scanner;

public class SistemaExercicio06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double a, b, c;
		System.out.println("Digite o valor dos lados do triângulo: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		System.out.printf("TRIANGULO: %.2f", (a * c) / 2);
		System.out.printf("\nCÍRCULO: %.2f", (3.14159) * c * c);
		System.out.printf("\nTRAPEZIO: %.2f", (a + b) * c / 2);
		System.out.printf("\nQUADRADO: %.2f", (b * b));
		System.out.printf("\nRETANGULO: %.2f", (a * b));

		input.close();

	}

}
