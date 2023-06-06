package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

	
	
}
