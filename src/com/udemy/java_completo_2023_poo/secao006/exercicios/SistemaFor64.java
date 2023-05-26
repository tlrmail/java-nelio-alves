package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaFor64 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

		for(int i = 0; i < n; i++) {
			double divisao = 0;
			double numerador = 0, denominador = 0;
			numerador = Double.valueOf(input.next());
			denominador = Double.valueOf(input.next());
			divisao = numerador / denominador;
			System.out.printf("Divisao: %.2f", divisao);
		}
		
		input.close();
	}

}
