package com.udemy.java_completo_2023_poo.secao005;

import java.util.Scanner;

public class Sistema39 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double preco = input.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

		System.out.println("Desconto: " + desconto);
		input.close();
	}

}
