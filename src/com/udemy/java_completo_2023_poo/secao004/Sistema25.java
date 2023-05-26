package com.udemy.java_completo_2023_poo.secao004;

import java.util.Locale;
import java.util.Scanner;

public class Sistema25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s01 = input.next();
		System.out.println(s01);
		
		int i01 = input.nextInt();
		System.out.println(i01);
		
		double d01 = input.nextDouble();
		System.out.println("Double com vírgula: " + d01);
		Locale.setDefault(Locale.US);
		double d02 = input.nextDouble();
		System.out.println("Double com ponto: " + d02);
		
		//Lendo um caracter
		char c01 = input.next().charAt(0);
		System.out.println("Você digitou o primeiro caracter: " + c01);
		
		String s02;
		int i02;
		double d03;
		
		System.out.println("3 variáveis de tipos diferentes:");
		s02 = input.next();
		i02 = input.nextInt();
		d03 = input.nextDouble();
		
		System.out.printf("String: %s, int: %d, double: %.8f ", s02,i02, d03);
		
		input.close();

	}

}
