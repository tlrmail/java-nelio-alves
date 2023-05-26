package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities;

public class BusinessAcount extends Account{
	
	private Double loanLimit;
	
	public BusinessAcount() {
		super();
	}
	
	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if(amount <= this.loanLimit)
			this.balance = this.balance + amount - 10;
	}

	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		this.balance = this.balance - 2.0;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	

}
