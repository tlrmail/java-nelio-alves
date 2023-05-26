package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.application;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.Account;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.SavingAccount;

public class Sistema116 {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		

	}

}
