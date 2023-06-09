package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.model.services;

import java.util.List;
import java.util.function.Predicate;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list, Predicate<Product> predicate) {
		double sum = 0.0;
		for(Product p: list) {
			if(predicate.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
