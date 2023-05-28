package com.udemy.java_completo_2023_poo.secao015.excecoes.exercicio;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao015.excecoes.exercicio.entities.Account;
import com.udemy.java_completo_2023_poo.secao015.excecoes.exercicio.exception.AccountException;

public class Sistema127 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");
			System.out.println("Number: ");
			Integer number = input.nextInt();
			System.out.println("Holder: ");
			String holder = input.next();
			System.out.println("Initial Balance: ");
			Double balance = input.nextDouble();
			System.out.println("Withdraw Limit: ");
			Double withdraw = input.nextDouble();
			Account acc = new Account(number, holder, balance, withdraw);

			System.out.println("Enter amount for withdraw: ");
			Double amount = input.nextDouble();
			acc.withdraw(amount);
			System.out.println("New balance: ");
			System.out.println("New balance: $".concat(acc.getBalance().toString()));
		} catch (AccountException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			input.close();

		}
	}
}
