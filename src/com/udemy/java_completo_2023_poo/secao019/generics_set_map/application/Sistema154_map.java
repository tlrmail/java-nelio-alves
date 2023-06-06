package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.Product;

public class Sistema154_map {

	public static void main(String[] args) {

		Map<Product, Double> stock = new HashMap<>();
		
		Product p01 = new Product("Tv", 900.0);
		Product p02 = new Product("Notebook", 1200.0);
		Product p03 = new Product("Tablet", 400.0);
		
		stock.put(p01, 10000.0);
		stock.put(p02, 20000.0);
		stock.put(p03, 15000.0);

		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		System.out.println("Contains value: " + stock.get(ps));
		System.out.println("Map: ");
		for(Entry<Product, Double> entry: stock.entrySet()) {
			System.out.println("Name: " + entry.getKey().getName() +", Price: " + entry.getKey().getPrice()+ ", Total in stock: "+entry.getValue());
		}
	}

}
