package com.udemy.java_completo_2023_poo.secao017.interfaces.model.entities.boasolucao;

public class BrasilTaxService {
	
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
