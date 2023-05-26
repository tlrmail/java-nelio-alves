package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaFor67 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + i*i + " " + i*i*i);
		}

		input.close();
	}

}
