package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio56 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		if(valor>= 0 && valor <= 25 )
			System.out.println("INTERVALO [0,25]");
		else if(valor > 25 && valor <= 50)
			System.out.println("INTERVALO [25,50]");
		else if(valor > 50 && valor <= 75)
			System.out.println("INTERVALO [50,75]");
		else if(valor > 75 && valor <= 100)
			System.out.println("INTERVALO [75,100]");
			
		input.close();

	}

}
