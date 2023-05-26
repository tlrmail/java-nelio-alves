package com.udemy.java_completo_2023_poo.secao010.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao010.exercicios.entities.Estudante;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int n = input.nextInt();
		System.out.println();
		String quartosLocados = "";
		Estudante estudantes[] = new Estudante[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome: ");
			String nome = input.next();
			System.out.println("Digite o email: ");
			String email = input.next();
			System.out.println("Digite o quarto: ");
			int quarto = input.nextInt();
			while (quartosLocados.contains(String.valueOf(quarto))) {
				System.out.println("Quarto locado. Digite novamente o quarto:");
				quarto = input.nextInt();
			}
			estudantes[i] = new Estudante(nome, email, quarto);
			quartosLocados = quartosLocados.concat(quarto + "-");
				

		}

		// Ordenar por quarto
		for (int i = 0; i < n; i++) {
			if(i < (n-1)) {
				Estudante estudanteAuxiliar = estudantes[i+1];
				if(estudantes[i].getQuarto() > estudanteAuxiliar.getQuarto() && estudanteAuxiliar != null) {
					estudantes[i+1] = estudantes[i];
					estudantes[i] = estudanteAuxiliar;
				}
			}
		}
		
		for(Estudante estudante: estudantes) {
			System.out.println("Name: " + estudante.getNome() );
			System.out.println("Email: " + estudante.getEmail());
			System.out.println("Room: " + estudante.getQuarto());
			System.out.println();
		}

		System.out.println("Busy rooms:");
		for(Estudante estudante: estudantes) {
			System.out.println(estudante);
		}
		
		input.close();
	}

}
