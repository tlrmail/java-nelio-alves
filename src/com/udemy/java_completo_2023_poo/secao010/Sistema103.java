package com.udemy.java_completo_2023_poo.secao010;

import java.util.Scanner;

public class Sistema103 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dimensão da matriz:");
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] matriz = new int[n][m];
		String esquerda = "", direita= "", abaixo= "", acima= "";

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matriz[i][j] = input.nextInt();
			}
		}

		int numero = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(numero == matriz[i][j]) {
					if((j - 1) > -1) {
						esquerda = esquerda + matriz[i][j-1];
					}
					
					if((j + 1) < m) {
						direita = direita + matriz[i][j+1];
					}
					
					if( (i-1) >= 0 ) {
						acima = acima + matriz[i-1][j];
					}
					
					if((i+1) < n) {
						abaixo = abaixo + matriz[i+1][j];
					}
				}
			}
		}

		if(!esquerda.isEmpty())
			System.out.println("Esquerda: " + esquerda);
		if(!direita.isEmpty())
			System.out.println("Direita: " + direita);
		if(!acima.isEmpty())
			System.out.println("Acima: " + acima);
		if(!abaixo.isEmpty())
			System.out.println("Abaixo: " + abaixo);
	}

}
