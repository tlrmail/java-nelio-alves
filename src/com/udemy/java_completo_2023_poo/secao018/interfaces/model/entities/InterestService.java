package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

import java.security.InvalidParameterException;

public interface InterestService {
	
	default public Double payment(Double amount, int months) {
		if(months < 1)
			throw new InvalidParameterException("Months must be greater than zero.");
		return amount * Math.pow(1 + this.getInterestRate()/100, months);
	}
	
	public Double getInterestRate();
	
}
