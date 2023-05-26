package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio51 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		
		if(numero > 0)
			System.out.println("NÃO NEGATIVO");
		else
			System.out.println("NEGATIVO");
		
		input.close();

	}

}
