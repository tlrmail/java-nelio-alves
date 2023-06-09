package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;
import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.util.ProductPredicate;

public class Sistema160_Predicate {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		/** Primeira forma */
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Mouse", 35.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.9));

		list.removeIf(p -> p.getPrice() >= 100);
		for (Product p : list) {
			System.out.println(p);
		}

		/** Segunda forma */
		List<Product> list02 = new ArrayList<>();

		list02.add(new Product("Tv", 900.0));
		list02.add(new Product("Notebook", 1200.0));
		list02.add(new Product("Mouse", 35.0));
		list02.add(new Product("Tablet", 350.0));
		list02.add(new Product("HD Case", 80.9));

		list02.removeIf(new ProductPredicate());
		System.out.println();
		for (Product p : list02) {
			System.err.println(p);
		}

		/** Terceira forma */
		List<Product> list03 = new ArrayList<>();

		list03.add(new Product("Tv", 900.0));
		list03.add(new Product("Notebook", 1200.0));
		list03.add(new Product("Mouse", 35.0));
		list03.add(new Product("Tablet", 350.0));
		list03.add(new Product("HD Case", 80.9));

		list03.removeIf(Product::staticProductPredicate);
		System.out.println();
		for (Product p : list03) {
			System.out.println(p);
		}

		/** Quarta forma */
		List<Product> list04 = new ArrayList<>();

		list04.add(new Product("Tv", 900.0));
		list04.add(new Product("Notebook", 1200.0));
		list04.add(new Product("Mouse", 35.0));
		list04.add(new Product("Tablet", 350.0));
		list04.add(new Product("HD Case", 80.9));

		list04.removeIf(Product::nonStaticProductPredicate);
		System.err.println();
		for (Product p : list04) {
			System.err.println(p);
		}

		/** Quinta forma */
		List<Product> list05 = new ArrayList<>();

		list05.add(new Product("Tv", 900.0));
		list05.add(new Product("Notebook", 1200.0));
		list05.add(new Product("Mouse", 35.0));
		list05.add(new Product("Tablet", 350.0));
		list05.add(new Product("HD Case", 80.9));

		Predicate<Product> predicate = new Predicate<Product>() {
			@Override
			public boolean test(Product p) {
				return p.getPrice() >= 100;
			}
		};
		list05.removeIf(predicate);
		System.err.println();
		for (Product p : list05) {
			System.out.println(p);
		}

		/** sexta forma */
		List<Product> list06 = new ArrayList<>();
		
		list06.addAll(list);

		double valor = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= valor; 

		list06.removeIf(pred);
		System.err.println();
		for (Product p : list06) {
			System.err.println(p);
		}
	}

}
