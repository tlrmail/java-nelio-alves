package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.Arrays;

public class Sistema158 {

	public static int globalValue = 3;
	
	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

	public static void changeOddValues(int[] numbers) {
		for(int i = 0; i < numbers.length ;i++) {
			if(numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}
