package com.udemy.java_completo_2023_poo.secao008.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao008.util.CurrencyConverter;

public class Exercicio08_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		System.out.println("What is the Dollar price?");
		double dolar = input.nextDouble();
		System.out.println("How many dollars will be bought?");
		double compra = input.nextDouble();
		System.out.printf("Amount to be paid id reais = %.4f", CurrencyConverter.calcularImposto(dolar * compra));
		input.close();
	}

}
