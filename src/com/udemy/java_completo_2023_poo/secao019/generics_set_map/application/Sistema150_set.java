package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.HashSet;
import java.util.Set;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.Product;

public class Sistema150_set {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod)); // essa comparação é feita por ponteiro(endereço da memória)

		for(Product p: set) {
			System.out.println(p);
		}
		
	}
}
