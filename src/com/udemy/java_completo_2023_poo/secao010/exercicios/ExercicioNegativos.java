package com.udemy.java_completo_2023_poo.secao010.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tamanho do vetor:");
		int n = input.nextInt();
		int vetor[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número:");
			vetor[i] = input.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for(int vet: vetor) {
			if(vet < 0) 
				System.out.println(vet);
		}

		input.close();

	}

}
