package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;
import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.util.UpperCaseName;

public class Sistema162_Function {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		/** Primeira forma */
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Mouse", 35.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.9));

		List<String> names =
				list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		names.forEach(System.out::println);
		
		/** Segunda forma */
		System.out.println();
		List<String> names2 =
				list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

		names2.forEach(System.err::println);

		/** Terceira forma */
		System.out.println();
		List<String> names3 = 
				list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		names3.forEach(System.out::println);

		/** quarta forma */
		System.out.println();
		List<String> names4 = 
				list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names4.forEach(System.err::println);
		
	}

}
