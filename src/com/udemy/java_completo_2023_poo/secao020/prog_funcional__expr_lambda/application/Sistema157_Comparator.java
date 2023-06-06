package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.MyComparator;
import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;

public class Sistema157_Comparator {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));
		
		MyComparator my = new MyComparator();
		
		list.sort(my);

		for(Product p: list) {
			System.out.println(p);
		}

		/** Segunda forma de fazer o Comparator */
		
		List<Product> list2 = new ArrayList<>();
		
		list2.add(new Product("Tv", 900.0));
		list2.add(new Product("Notebook", 1200.0));
		list2.add(new Product("Tablet", 450.0));
		
		//Classe anônima
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list2.sort(comp);
		
		System.out.println();
		for(Product p: list2) {
			System.err.println(p);
		}

		/** Terceira forma de fazer o Comparator */
		
		List<Product> list3 = new ArrayList<>();
		
		list3.add(new Product("Tv", 900.0));
		list3.add(new Product("Notebook", 1200.0));
		list3.add(new Product("Tablet", 450.0));
		
		//Arrow function
		Comparator<Product> comparator = (p1,p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		list3.sort(comparator);
		
		System.out.println();
		for(Product p: list3) {
			System.out.println(p);
		}

		/** Quarta forma de fazer o Comparator */
		
		List<Product> list4 = new ArrayList<>();
		
		list4.add(new Product("Tv", 900.0));
		list4.add(new Product("Notebook", 1200.0));
		list4.add(new Product("Tablet", 450.0));
		
		//Arrow function
		Comparator<Product> comparator2 = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		
		list4.sort(comparator2);
		
		System.out.println();
		for(Product p: list4) {
			System.err.println(p);
		}

		/** Quinta forma de fazer o Comparator */
		
		List<Product> list5 = new ArrayList<>();
		
		list5.add(new Product("Tv", 900.0));
		list5.add(new Product("Notebook", 1200.0));
		list5.add(new Product("Tablet", 450.0));
		
		list5.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		System.out.println();
		for(Product p: list5) {
			System.out.println(p);
		}

	}

}
