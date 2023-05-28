package com.udemy.java_completo_2023_poo.secao015.excecoes.exercicio.entities;

import com.udemy.java_completo_2023_poo.secao015.excecoes.exercicio.exception.AccountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance = this.balance + amount;
	}
	
	public void withdraw(Double amount) throws AccountException{
		if( this.withdrawLimit < amount) {
			throw new AccountException("O saque está além do limit.");
		}else if(this.balance < amount) {
			throw new AccountException("Não tem saldo para o saque.");
		}
		this.balance = this.balance - amount;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

}
