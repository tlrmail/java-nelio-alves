package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaExercicioWhile63 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int codigo = -1;
		
		while(codigo < 4 || codigo > 1) {
			System.out.println("Tipo de combustível: ");
			codigo = input.nextInt();
			switch(codigo) {
				case 1 :{
					System.out.println("Álcool: "+ codigo);
					break;
				}
				case 2 :{
					System.out.println("Gasolina: " + codigo);
					break;
				}
				case 3 :{
					System.out.println("Diesel:" + codigo);
					break;
				}
				case 4 :{
					System.out.println("MUITO OBRIGADO");
					break;
				} default: {
					System.out.println("Código incorreto!");
					break;
				}
			}
			if(codigo == 4)
				break;
		}
			input.close();
		
	}
}