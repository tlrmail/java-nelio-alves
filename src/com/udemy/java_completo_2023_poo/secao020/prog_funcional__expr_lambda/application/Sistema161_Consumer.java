package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;
import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.util.PriceUpdate;

public class Sistema161_Consumer {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		/** Primeira forma */
		List<Product> list = new ArrayList<>();
		List<Product> list02 = new ArrayList<>();
		List<Product> list03 = new ArrayList<>();
		List<Product> list04 = new ArrayList<>();
		List<Product> list05 = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Mouse", 35.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.9));

		list.forEach(new PriceUpdate());
		list.forEach(System.err::println);
		
		/** Segunda forma */
		System.out.println();
		list02.addAll(list);
		list02.forEach(Product::staticPriceUpdate);
		list02.forEach(System.out::println);

		/** Terceira Forma*/
		System.out.println();
		list03.addAll(list);
		list03.forEach(Product::nonStaticPriceUpdate);
		list03.forEach(System.err::println);

		/** Quarta Forma*/
		System.out.println();
		list04.addAll(list);
		
		double factor = 1.1;
		Consumer<Product> consumer = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		
		list04.forEach(consumer);
		list04.forEach(System.out::println);

		/** quinta Forma*/
		System.out.println();
		list05.addAll(list);
		list05.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list05.forEach(System.err::println);

	}

}
