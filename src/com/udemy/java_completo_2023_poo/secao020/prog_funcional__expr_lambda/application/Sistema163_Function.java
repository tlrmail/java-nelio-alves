package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;
import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.model.services.ProductService;

public class Sistema163_Function {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		/** Primeira forma */
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Mouse", 35.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.9));
		
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		System.out.println("Sum = " + String.format("%.2f", sum));

		sum = ps.filteredSum(list, p -> p.getPrice() < 100);
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
