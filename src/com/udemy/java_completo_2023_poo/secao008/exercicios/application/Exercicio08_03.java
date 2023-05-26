package com.udemy.java_completo_2023_poo.secao008.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao008.exercicios.entities.Estudante;

public class Exercicio08_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("ENTRADA:");
		Estudante estudante = new Estudante();
		estudante.nome = input.nextLine();
		for(int i = 0; i < 3; i++) {
			estudante.notas[i] = input.nextDouble();
		}
		estudante.calcularAprovacao();
		estudante.exibirResultadoFinal();
		
		input.close();

	}

}
