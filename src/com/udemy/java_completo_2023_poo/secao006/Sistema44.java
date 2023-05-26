package com.udemy.java_completo_2023_poo.secao006;

import java.util.Scanner;

public class Sistema44 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma = soma + x;
			x = input.nextInt();
		}
		
		System.out.println(soma);
		
		input.close();

	}

}
