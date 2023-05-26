package com.udemy.java_completo_2023_poo.secao005;

import java.util.Locale;
import java.util.Scanner;

public class Sistema37 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double conta = 50;
		int minutos = input.nextInt();
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		System.out.printf("Valor da conta: R$%.2f", conta);

		input.close();
	}

}
