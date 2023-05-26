package com.udemy.java_completo_2023_poo.secao010;

import java.util.Locale;
import java.util.Scanner;

public class Sistema102 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Dimensão da matriz:");
		int n = input.nextInt();
		int[][] matriz = new int[n][n];
		String negativos = "";

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = input.nextInt();
				if (matriz[i][j] < 0)
					negativos = negativos.concat(matriz[i][j] + ",");
			}
		}

		System.out.printf("Diagonal: %d %d %d%n", matriz[0][0], matriz[1][1], matriz[2][2]);
		System.out.println("Números negativos:");
		String neg[] = negativos.split(",");
		for (String negative : neg) {
			System.out.print(negative + " ");
		}
		System.out.printf("\nTotal de negativos: %d", neg.length);
		input.close();

	}

}
