package com.udemy.java_completo_2023_poo.secao008.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao008.entities.Product;

public class Sistema66 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = input.next();
		System.out.println("Price: ");
		product.price = input.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = input.nextInt();
		
		System.out.println(product);
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		int quantity = input.nextInt();
		product.addProduct(quantity);
		System.out.println(product);
		
		System.out.println("\nEnter the number of products to be removed in stock: ");
		quantity = input.nextInt();
		product.removeProduct(quantity);
		System.out.println(product);
		
		input.close();

	}

}
