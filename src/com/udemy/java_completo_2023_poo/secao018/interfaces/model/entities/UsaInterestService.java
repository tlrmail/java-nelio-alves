package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

public class UsaInterestService implements InterestService{

	private Double interestRate;
	
	public UsaInterestService() {
		// TODO Auto-generated constructor stub
	}

	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}

}
