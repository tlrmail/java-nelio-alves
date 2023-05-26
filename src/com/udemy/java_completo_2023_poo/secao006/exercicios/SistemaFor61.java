package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaFor61 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		for(int i = 1; i < 1000 ;i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
			if(i > x)
				break;
		}
		
		input.close();

	}

}
