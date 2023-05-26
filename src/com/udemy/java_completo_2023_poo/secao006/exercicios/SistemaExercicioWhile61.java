package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaExercicioWhile61 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String senha = input.next();
		
		while(!senha.equals("2002")) {
			System.out.println("Senha inválida!");
			senha = input.next();
		}
		
		System.out.println("Acesso permitido!");
		
		
		input.close();

	}

}
