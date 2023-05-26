package com.udemy.java_completo_2023_poo.secao010.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao010.exercicios.entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vc vai digitar?");

		int n = input.nextInt();
		Pessoa vetor[] = new Pessoa[n];
		
		String nome = "";
		int idade = 0;
		double altura = 0.0;
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da "+(i+1)+"ª pessoa:");
			System.out.print("Digite o nome:");
			nome = input.next();
			System.out.print("Digite a idade:");
			idade = input.nextInt();
			System.out.print("Digite a altura:");
			altura = input.nextDouble();
			vetor[i] = new Pessoa(nome,idade,altura);
		}
		
		double soma = 0;
		double mediaAltura = 0;
		String[] pes = new String[n];
		double menos16 = 0;
	
		System.out.print("\nValores: ");
		int count = 0;
		for(Pessoa pessoa: vetor) {
			soma += pessoa.getAltura();
			if(pessoa.getIdade() < 16) {
				menos16 += 1;
				pes[count] = pessoa.getNome();
			}
			count++;
		}
		
		mediaAltura = soma/n;
		
		System.out.printf("\nMédia: %.2f",mediaAltura);
		System.out.printf("\nPessoas com menos de 16: %.2f porcento\n",(menos16/n)*100);
		for(String p: pes) {
			System.out.println(p);
		}
		input.close();

	}

}
