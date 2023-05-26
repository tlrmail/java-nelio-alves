package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaFor66 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			int aux = (n%i == 0)? i : -1;
			if(aux != -1)
				System.out.println(aux);
		}
		
		input.close();

	}

}
