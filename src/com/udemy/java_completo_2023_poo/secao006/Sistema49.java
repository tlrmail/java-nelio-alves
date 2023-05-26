package com.udemy.java_completo_2023_poo.secao006;

import java.util.Scanner;

public class Sistema49 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int x = 0, soma = 0;

		for (int i = 0; i < n; i++) {
			x = input.nextInt();
			soma = soma + x;
		}

		System.out.println("Soma:" + soma);

		input.close();

	}

}
