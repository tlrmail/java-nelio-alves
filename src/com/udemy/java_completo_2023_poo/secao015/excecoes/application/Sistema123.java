package com.udemy.java_completo_2023_poo.secao015.excecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema123 {

	public static void main(String[] args) {
		
		method_02();
		System.out.println("End of program!");
	}

	public static void method_01() {
		System.out.println("***Method_01 START***");
		Scanner input = new Scanner(System.in);
		int position = 0;
		String[] vect = {};
		try {
			vect = input.nextLine().split(" ");
			position = input.nextInt();
			System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			position = input.nextInt();
			System.out.println(vect[position]);
		}catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		
		input.close();
		System.out.println("***Method_01 END***");

	}
	
	public static void method_02() {
		System.out.println("***Method_02 START***");
		method_01();
		System.out.println("***Method_02 END***");
		
	}
	
}
