package com.udemy.java_completo_2023_poo.secao004.exercicios;

import java.util.Scanner;

public class SistemaExercicio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String peca1,peca2;
		int numero1, numero2;
		double valorUnitario1, valorUnitario2;
		
		System.out.println("C�digo, n�mero, valor unit�rio da pe�a1: ");
		peca1 = input.next();
		numero1 = input.nextInt();
		valorUnitario1 = input.nextDouble();
		
		System.out.println("C�digo, n�mero, valor unit�rio da pe�a2: ");
		peca2 = input.next();
		numero2 = input.nextInt();
		valorUnitario2 = input.nextDouble();

		double valorTotal = numero1 * valorUnitario1 + numero2 * valorUnitario2;
		
		System.out.println("VALOR A PAGAR: " + valorTotal);
		
		input.close();

	}

}
