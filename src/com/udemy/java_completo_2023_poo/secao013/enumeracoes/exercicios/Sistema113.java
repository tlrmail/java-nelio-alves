package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.Client;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.Order;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.OrderItem;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.Product;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.enums.OrderStatus;

public class Sistema113 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = input.next();
		System.out.print("Email: ");
		String email = input.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = input.next();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = input.next().toUpperCase();
		System.out.print("How many items to this order? ");
		Client client = new Client(name, email, sdf.parse(date));
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		int n = input.nextInt();
		for(int i = 0;i < n;i++) {
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name: ");
			String productName = input.next();
			System.out.print("Product price: ");
			Double price = input.nextDouble();
			System.out.println("Quantity: ");	
			Integer quantity = input.nextInt();
			OrderItem item = new OrderItem(quantity, price, new Product(productName, price));
			order.addItem(item);
		}
		
		System.out.println(order);
		
		input.close();

	}

}
