package com.udemy.java_completo_2023_poo.secao009.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao009.entities.Product;

public class Sistema75 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = input.next();
		System.out.println("Price: ");
		double price = input.nextDouble();
		System.out.println("Quantity: ");
		int quantity = input.nextInt();
		
		Product product = new Product(name, price, quantity);

		System.out.println(product);
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		quantity = input.nextInt();
		product.addProduct(quantity);
		System.out.println(product);
		
		System.out.println("\nEnter the number of products to be removed in stock: ");
		quantity = input.nextInt();
		product.removeProduct(quantity);
		System.out.println(product);
		
		input.close();

	}

}
