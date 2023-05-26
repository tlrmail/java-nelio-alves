package com.udemy.java_completo_2023_poo.secao004;

import java.util.Scanner;

public class Sistema26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i01;
		String s01, s02, s03;
		i01 = input.nextInt(); // Gera "quebra de linha pendente" ao clicar o botão ENTER
		input.nextLine();      // Ajusta a quebra de linha pendente
		s01 = input.nextLine();
		s02 = input.nextLine();
		s03 = input.nextLine();
		
		//Faça uma DOAÇÃO via PIX 
		//de qualquer valor e ajude 
		// a manter este site livre de anúncios irritantes. O site da hora certa necessita de
		
		
		System.out.println("Dados digitados:");
		System.out.println(i01);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		
		input.close();

	}

}
