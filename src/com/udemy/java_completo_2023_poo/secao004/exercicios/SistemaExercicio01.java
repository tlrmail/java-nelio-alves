package com.udemy.java_completo_2023_poo.secao004.exercicios;

import java.util.Scanner;

public class SistemaExercicio01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int i01 = input.nextInt();
		int i02 = input.nextInt();
		int soma = i01 + i02;
		
		System.out.printf("%d + %d = %d", i01, i02, soma);
		
		
		input.close();

	}

}
