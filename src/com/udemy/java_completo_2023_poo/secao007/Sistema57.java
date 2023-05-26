package com.udemy.java_completo_2023_poo.secao007;

import java.util.Scanner;

public class Sistema57 {

	public static void main(String[] args) {

		int a = 89;
		int b = 60;
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);

		Scanner input = new Scanner(System.in);
		int mask = 0b00100000;
		int c =input.nextInt();

		System.out.println(c & mask);
		
		if((c & mask) != 0)
			System.out.println("6th bit is true!");
		else
			System.out.println("6th bit is false!");

		input.close();
		
	}

}
