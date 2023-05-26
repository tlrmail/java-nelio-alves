package com.udemy.java_completo_2023_poo.secao005;

import java.util.Scanner;

public class Sistema34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int hora;
		System.out.println("Digite a hora, por gentileza: ");
		hora = input.nextInt();
		
		if(hora >= 5 && hora < 12)
			System.out.println("Bom dia!");
		else if(hora >= 12 && hora < 18)
			System.out.println("Bom tarde!");
		else if(hora >= 18 || hora < 5)
			System.out.println("Bom noite!");
		
		input.close();
		
	}

}
