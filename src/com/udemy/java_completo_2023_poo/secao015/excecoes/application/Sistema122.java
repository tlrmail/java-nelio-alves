package com.udemy.java_completo_2023_poo.secao015.excecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema122 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			String[] vect = input.nextLine().split(" ");
			int position = input.nextInt();
			System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
		}catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("End of program!");
		
		input.close();

	}

}
