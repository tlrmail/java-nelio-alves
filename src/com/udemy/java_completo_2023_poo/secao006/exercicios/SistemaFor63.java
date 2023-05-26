package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaFor63 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

		for(int i = 0; i < n; i++) {
			double soma = 0;
			for(int j = 0 ; j < 3 ; j++) {
				double auxiliar = 0;
				auxiliar = Double.valueOf(input.next());
				soma = soma + auxiliar;
			}
			System.out.printf("Soma: %.2f", soma);
		}
		
		input.close();
		
	}
	
}
