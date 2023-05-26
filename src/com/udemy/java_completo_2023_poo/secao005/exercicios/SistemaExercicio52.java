package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio52 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		
		if(numero % 2 == 0)
			System.out.println("É PAR.");
		else
			System.out.println("É IMPAR.");
		
		input.close();

	}

}
