package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.util;

import java.util.function.Consumer;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
