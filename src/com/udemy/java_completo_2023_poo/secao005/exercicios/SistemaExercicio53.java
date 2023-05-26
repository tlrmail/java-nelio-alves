package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio53 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double numero1, numero2;
		
		System.out.println("Digite dois números:");
		numero1 = input.nextInt();
		numero2 = input.nextInt();
		
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("São múltiplos.");
		}else{
			System.out.println("Não são múltiplos.");
		}
		
		input.close();
		

	}

}
