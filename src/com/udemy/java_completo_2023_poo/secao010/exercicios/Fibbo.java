package com.udemy.java_completo_2023_poo.secao010.exercicios;

public class Fibbo {
	public static void main(String[] args) {
		fib(1,1);
	}
	
	public static void fib(int anterior, int atual) {
		System.out.println(anterior);
		int proximo = anterior + atual;
		if(proximo < 100)
			fib(atual,proximo);
	}
}
