package com.udemy.java_completo_2023_poo.secao010;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao009.entities.Product;

public class Sistema089 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		Product products[] = new Product[n];
		for(int i = 0; i < n ;i++) {
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			products[i] = new Product(name, price);
		}
		
		double soma = 0;
		for(Product product: products) {
			soma = soma + product.getPrice();
		}
		
		System.out.printf("Média dos produtos: %.2f", soma/n);
		
		input.close();

	}

}
