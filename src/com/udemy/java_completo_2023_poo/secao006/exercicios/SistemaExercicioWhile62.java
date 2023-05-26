package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaExercicioWhile62 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valorX = -1, valorY = -1;

		while (valorX != 0 && valorY != 0) {

			valorX = input.nextInt();
			valorY = input.nextInt();

			if (valorX > 0 && valorY > 0)
				System.out.println("Q1");
			else if (valorX < 0 && valorY > 0)
				System.out.println("Q2");
			else if (valorX < 0 && valorY < 0)
				System.out.println("Q3");
			else if (valorX > 0 && valorY < 0)
				System.out.println("Q4");
			
		}
		input.close();

	}

}
