package com.udemy.java_completo_2023_poo.secao010.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos números vc vai digitar:");

		int n = input.nextInt();
		int vetor[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número:");
			vetor[i] = input.nextInt();
		}
		
		int soma = 0;
		int media = 0;
		System.out.print("\nValores: ");
		for(int vet: vetor) {
			System.out.print(vet+" ");
			soma += + vet;
		}
		
		media = soma/n;
		
		System.out.printf("\nSoma: %d",soma);
		System.out.printf("\nMédia: %d",media);
		
		input.close();

	}

}
