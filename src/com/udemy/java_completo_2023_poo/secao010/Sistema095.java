package com.udemy.java_completo_2023_poo.secao010;

public class Sistema095 {

	public static void main(String[] args) {

		int x = 20;

		Object obj = x; // Boxing -->> encaixotamento

		System.out.println("x: " + x);

		int y = (int) obj; // unboxing -->> desencaixotamento

		System.out.println("y: " + y);

		Integer z = 12 * 15; // wrapper class, boxing e unboxing são comuns
	
		System.out.println("z: " + z);
		
	}

}
