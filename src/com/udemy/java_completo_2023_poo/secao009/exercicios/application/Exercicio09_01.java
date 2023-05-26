package com.udemy.java_completo_2023_poo.secao009.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao009.exercicios.entities.Conta;

public class Exercicio09_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Nome do cliente: ");
		String name = input.next();
		System.out.println("Número da conta: ");
		String numero = input.next();
		System.out.println("Depósito Inicial(s/n)?");
		char depositar = input.next().toLowerCase().charAt(0);
		Conta conta;
		if (depositar == 's') {
			System.out.println("Valor do depósito: ");
			double deposito = input.nextDouble();
			conta = new Conta(numero, name, deposito);
		} else {
			conta = new Conta(numero, name);
		}

		System.out.println(conta);

		System.out.println("Depósito ou saque?(d/s)");
		depositar = input.next().toLowerCase().charAt(0);

		if (depositar == 'd') {
			System.out.println("Valor do depósito: ");
			double deposito = input.nextDouble();
			conta.deposito(deposito);
		} else {
			System.out.println("Valor do saque: ");
			double saque = input.nextDouble();
			conta.saque(saque);
		}

		System.out.println("\nDados atualizados:\n" + conta);

		input.close();

	}

}
