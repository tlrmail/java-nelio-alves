package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaFor65 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int fatorial = 1;
		for(int i = 0; i < n; i++) {
			fatorial = fatorial * (n - i);
		}
		
		System.out.printf("Fatorial de %d, é: %d", n, fatorial);
		
		input.close();

	}

}
