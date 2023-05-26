package com.udemy.java_completo_2023_poo.secao006.exercicios;

import java.util.Scanner;

public class SistemaFor62 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int in=0, out=0, x;

		for (int i = 0; i < 5; i++) {
			x = input.nextInt();
			if(x >= 10 && x <=20)
				in++;
			else
				out++;
		}

		System.out.println("IN: " + in);
		System.out.println("OUT: " + out);
		
		input.close();

	}

}
