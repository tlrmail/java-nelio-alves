package com.udemy.java_completo_2023_poo.secao004.exercicios;

import java.util.Scanner;

public class SistemaExercicio03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c, d, diferenca;

		System.out.println("A: ");
		a = input.nextInt();
		System.out.println("B: ");
		b = input.nextInt();
		System.out.println("C: ");
		c = input.nextInt();
		System.out.println("D: ");
		d = input.nextInt();
		diferenca = (a * b - c * d);
		System.out.println("Diferença(a * b - c * d): " + diferenca);

		input.close();

	}

}
