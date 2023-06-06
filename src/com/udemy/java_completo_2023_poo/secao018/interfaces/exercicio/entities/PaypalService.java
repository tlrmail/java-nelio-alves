package com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio.entities;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}
	
	@Override
	public Double interest(Double amount, Integer months) {
		Double acumulador = amount;
		for(int i = 0; i < months ;i++) {
			acumulador = acumulador + acumulador * 0.01;
		}
		return acumulador;
	}
}
