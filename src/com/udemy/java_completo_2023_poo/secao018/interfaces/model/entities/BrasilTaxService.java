package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

import com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities.boasolucao.TaxService;

public class BrasilTaxService implements TaxService{
	
	public Double tax(Double amount) {
		Double retorno;
		if(amount <= 100.0) {
			retorno =  amount * 0.2;
		}else {
			retorno = amount * 0.15;
		}
		return retorno;
	}
	
}
