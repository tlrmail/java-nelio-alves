package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio57 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int valorX, valorY;
		valorX = input.nextInt();
		valorY = input.nextInt();
		
		if(valorX > 0 && valorY > 0)
			System.out.println("Q1");
		else if(valorX < 0 && valorY > 0)
			System.out.println("Q2");
		else if(valorX < 0 && valorY < 0)
			System.out.println("Q3");
		else if(valorX > 0 && valorY < 0)
			System.out.println("Q4");
		
		input.close();
		
	}
	
}
