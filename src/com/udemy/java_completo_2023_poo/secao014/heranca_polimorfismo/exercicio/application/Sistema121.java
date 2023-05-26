package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.Pessoa;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.PessoaFisica;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.PessoaJuridica;

public class Sistema121 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n =  input.nextInt();
		
		for(int i = 0;i < n; i++) {
			input.nextLine();
			System.out.println("Tax payer #"+(i+1)+" data: ");
			System.out.println("Individual or company (i/c)? ");
			char opc = input.nextLine().toLowerCase().charAt(0);
			System.out.println("Name: ");
			String name = input.nextLine();
			System.out.println("Anual income: ");
			Double gasto = input.nextDouble();
			if(opc == 'i') {
				System.out.println("Health expenditures: ");
				Double saude = input.nextDouble();
				pessoas.add(new PessoaFisica(name, gasto, saude));
			}if(opc == 'c') {
				System.out.println("Number of employees: ");
				Integer emp = input.nextInt();
				pessoas.add(new PessoaJuridica(name, gasto, emp));
			}
		}

		System.out.println("TAXES PAID:");
		Double sum = 0.0;
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa);
			sum = sum + pessoa.calcularImposto();
		}
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		

	}

}
