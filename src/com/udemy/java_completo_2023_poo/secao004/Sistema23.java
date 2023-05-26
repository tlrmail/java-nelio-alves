package com.udemy.java_completo_2023_poo.secao004;

import java.util.Locale;

public class Sistema23 {

	public static void main(String[] args) {

		double x = 4.73627;
		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.print("Olá mundo!");
		System.out.println("Olá mundo!");

		String s01 = "asdfadf";
		String s02 = "asdfadf";
		String s03 = "asdfadf";
		System.out.println(s01.concat(s02).concat(s03));

		System.out.printf("%s %.2f %s",s01,x,s01.concat(s02).concat(s03));
	}

}
