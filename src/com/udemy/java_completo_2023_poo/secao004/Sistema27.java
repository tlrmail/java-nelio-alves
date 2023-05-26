package com.udemy.java_completo_2023_poo.secao004;

public class Sistema27 {

	public static void main(String[] args) {

		int x = 3, y = 11;
		double d01 = -3;
		double d02 = 23.329238932;

		System.out.printf("Raiz quadrada de x(%d): %.18f", x, Math.sqrt(x));
		System.out.printf("\nx(%d) elevado a y(%d): %.0f", x, y, Math.pow(x, y));
		System.out.printf("\nValor absoluto de %.0f", Math.abs(d01));
		System.out.printf("\nArredondado: " + Math.round(d02));
		System.out.printf("\nArredondado pra cima(%.0f): ", Math.ceil(d02));
		System.out.printf("\nArredondado pra baixo(%.0f): ", Math.floor(d02));
		

	}

}
