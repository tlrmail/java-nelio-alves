package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.AccountAbstract;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.BusinessAcountConcrete;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.entities.SavingAccountConcrete;

public class Sistema119 {

	public static void main(String[] args) {

		List<AccountAbstract> list = new ArrayList<>();
		
		list.add(new SavingAccountConcrete(1001,"Alex", 500.0, 0.01));
		list.add(new BusinessAcountConcrete(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingAccountConcrete(1003, "Bob", 2000.0, 0.01));
		list.add(new SavingAccountConcrete(1003, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for(AccountAbstract acc: list) {
			sum = sum + acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);
		
		for(AccountAbstract acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
