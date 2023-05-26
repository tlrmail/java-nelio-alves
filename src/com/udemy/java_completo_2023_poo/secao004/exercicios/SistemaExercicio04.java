package com.udemy.java_completo_2023_poo.secao004.exercicios;

import java.util.Scanner;

public class SistemaExercicio04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero, horas;
		double valorPorHora;

		System.out.println("Número do funcionário: ");
		numero = input.nextInt();
		System.out.println("Horas trabalhadas: ");
		horas = input.nextInt();
		System.out.println("Valor que recebe por horas trabalhadas: ");
		valorPorHora = input.nextDouble();

		System.out.printf("NUMBER = %d", numero);
		System.out.printf("\nSALARY = %.4f", horas * valorPorHora);

		input.close();

	}

}
