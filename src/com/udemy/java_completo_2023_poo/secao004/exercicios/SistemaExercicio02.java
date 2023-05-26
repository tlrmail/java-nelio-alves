package com.udemy.java_completo_2023_poo.secao004.exercicios;

import java.util.Scanner;

public class SistemaExercicio02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o raio:");
		double raio = input.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);
		System.out.printf("Área: %.8f", area);
		
		input.close();
		
	}

}
