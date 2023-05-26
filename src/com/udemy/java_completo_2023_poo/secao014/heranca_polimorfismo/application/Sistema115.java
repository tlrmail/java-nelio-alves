package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.application;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.Account;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.BusinessAcount;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.SavingAccount;

public class Sistema115 {

	public static void main(String[] args) {

		Account account = new Account(1001, "Alex", 1000.0);
		account.withdraw(200.0);
		System.out.println(account.getBalance());
		
		Account account2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		account2.withdraw(200.0);
		System.out.println(account2.getBalance());
		
		Account account3 = new BusinessAcount(1003, "Bob", 1000.0, 500.0);
		account3.withdraw(200.0);
		System.out.println(account3.getBalance());

	}

}
