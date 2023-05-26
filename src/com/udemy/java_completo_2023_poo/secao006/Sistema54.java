package com.udemy.java_completo_2023_poo.secao006;

import java.util.Scanner;

public class Sistema54 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String repetir = ""; 
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double celsius = input.nextDouble();
			double faren = 9*celsius/5 + 32;
			System.out.printf("Temperatura em Fahrenheit: %.2f%n",faren);
			System.out.println("Deseja repetir?(s/n) ");
			repetir = String.valueOf(input.next().charAt(0));
		}while(repetir.equals("s"));
		
		input.close();

	}

}
