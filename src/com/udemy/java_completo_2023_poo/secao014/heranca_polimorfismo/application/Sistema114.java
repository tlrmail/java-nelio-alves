package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.application;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.Account;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.BusinessAcount;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.SavingAccount;

public class Sistema114 {

	public static void main(String[] args) {

		Account account = new Account(1001, "Alex", 0.0);
		BusinessAcount businessAcount = new BusinessAcount(1002, "Maria Sarah", 0.0, 500.00);
		
		//UPCASTING
		Account account2 = businessAcount;
		Account account3 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Account account4 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAcount businessAcount2 = (BusinessAcount) account2;
		businessAcount2.loan(100.0);
		if( account4 instanceof BusinessAcount) {
			BusinessAcount businessAcount3 = (BusinessAcount)account4;
			businessAcount.loan(50.00);
			System.out.println("Loan!");
		}
		
		if(account4 instanceof SavingAccount) {
			SavingAccount account5 = (SavingAccount) account4;
			account5.updateBalance();
			System.out.println("Update!");
		}
	}

}
