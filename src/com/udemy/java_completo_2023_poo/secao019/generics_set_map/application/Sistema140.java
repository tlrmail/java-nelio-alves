package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.PrintService;

public class Sistema140 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		PrintService<Integer> print = new PrintService<>();
		
		System.out.println("How many values?");
		int n = input.nextInt();
		
		for(int i = 0; i < n;i++) {
			int value = input.nextInt();
			print.addValue(value);
		}
		
		print.print();
		Integer first = print.first();
		System.out.println("First: " + first);
		
		input.close();

	}

}
