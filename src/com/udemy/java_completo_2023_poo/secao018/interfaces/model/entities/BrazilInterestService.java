package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

public class BrazilInterestService implements InterestService{

	private Double interestRate;
	
	public BrazilInterestService() {
		// TODO Auto-generated constructor stub
	}

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public Double getInterestRate() {
		return interestRate;
	}

}
