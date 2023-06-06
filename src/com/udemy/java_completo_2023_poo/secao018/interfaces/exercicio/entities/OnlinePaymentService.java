package com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio.entities;

public interface OnlinePaymentService {
	
	public Double paymentFee(Double amount);
	public Double interest(Double amount, Integer months);
	
}
