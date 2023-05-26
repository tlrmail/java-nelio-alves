package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio58 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double salario, ir = 0;

		salario = input.nextDouble();

		if (salario > 4500)
			ir = 1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28;
		else if (salario > 3000 && salario < 4500)
			ir = 1000 * 0.08 + (salario - 3000) * 0.18;
		else if (salario < 3000 && salario > 2000)
			ir = salario * 0.08;

		if (salario < 2000.01)
			System.out.println("INSENTO");
		else
			System.out.printf("Imposto: R$ %.2f", ir);

		input.close();

	}

}
