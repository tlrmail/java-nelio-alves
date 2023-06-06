package com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio.entities.Contract;
import com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio.entities.ContractService;
import com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio.entities.Installment;
import com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio.entities.PaypalService;

public class Sistema136 {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.println("Numero: ");
		Integer number = input.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		Date date = sdf.parse(input.next());
		System.out.println("Valor do contrato: ");
		Double value = input.nextDouble();
		Contract contract = new Contract(number, date, value);
		System.out.println("Entre com o numero de parcelas: ");
		int n = input.nextInt();
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, n);
		System.out.println();
		System.out.println("Parcelas: ");
		for(Installment installment: contract.getInstallments()) {
			System.out.println(installment);
		}
			
		input.close();
	}
	
}
