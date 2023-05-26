package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities;

public final class SavingAccountConcrete extends AccountAbstract{

	private Double interestRate;
	
	public SavingAccountConcrete() {
		super();
	}

	public SavingAccountConcrete(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		this.balance = this.balance - amount;
	}

	public void updateBalance() {
		this.interestRate = this.interestRate + this.interestRate * this.balance;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
