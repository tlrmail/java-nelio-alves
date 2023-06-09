package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.util;

import java.util.function.Function;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

	
	
}
