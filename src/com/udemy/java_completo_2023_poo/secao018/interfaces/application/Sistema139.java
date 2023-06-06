package com.udemy.java_completo_2023_poo.secao018.interfaces.application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities.UsaInterestService;

public class Sistema139 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Amount: ");
		Double amount = input.nextDouble();
		System.out.println("Months: ");
		Integer months = input.nextInt();
		
		try {
			UsaInterestService service = new UsaInterestService(1.0);
			double payment = service.payment(amount, months);
			System.out.println("Payment after " + months + " months: ");
			System.out.println(String.format("%.2f", payment));
		}catch(InvalidParameterException e) {
			System.out.println("Error: " + e.getMessage());
		}
		input.close();

	}

}
