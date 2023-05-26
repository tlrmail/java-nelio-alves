package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio55 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("1 - Cachorro Quente   R$4,0");
		System.out.println("2 - X-Salada          R$4,5");
		System.out.println("3 - X-Bacon           R$5,0");
		System.out.println("4 - Torrada Simples   R$2,00");
		System.out.println("5 - Refrigerante      R$1,00");
		
		int codigo, qtde;
		double total = 0;
		codigo = input.nextInt();
		qtde = input.nextInt();
		
		switch(codigo) {
			case 1:{
				total = qtde * 4;
				break;
			}
			case 2:{
				total = qtde * 4.5;
				break;
			}
			case 3:{
				total = qtde * 5;
				break;
			}
			case 4:{
				total = qtde * 2;
				break;
			}
			case 5:{
				total = qtde * 1;
				break;
			}default:{
				System.out.println("Código inválido!");
				break;
			}
		}
		
		if(!(codigo <1 || codigo > 5))
			System.out.printf("Total: %.2f", total);
		
		input.close();

	}

}
