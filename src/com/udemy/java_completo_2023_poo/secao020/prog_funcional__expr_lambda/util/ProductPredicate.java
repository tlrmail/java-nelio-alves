package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.util;

import java.util.function.Predicate;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	

}
