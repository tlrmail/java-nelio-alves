package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.ImportedProduct;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.Product;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.UsedProduct;

public class Sistema118 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = input.nextInt();
		for(int i = 0; i < n;i++) {
			input.nextLine();
			System.out.println("Product #"+(i+1)+" data: ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char prod = input.nextLine().toLowerCase().charAt(0);
			System.out.println("Name: ");
			String name = input.nextLine();
			System.out.println("Price: ");
			Double price = input.nextDouble();
			Product product = new Product();

			if(prod == 'i') {
				System.out.println("Customs fee: ");
				Double customsFee = input.nextDouble();
				product = new ImportedProduct(name, price, customsFee);
			}else if(prod == 'u'){
				input.nextLine();
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date date = UsedProduct.sdf.parse(input.nextLine());
				product = new UsedProduct(name, price, date);
			}else if(prod == 'c') {
				product = new Product(name, price);
			}
			products.add(product);
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product product: products) {
			System.out.println(product);
		}
		
		input.close();
	}

}
