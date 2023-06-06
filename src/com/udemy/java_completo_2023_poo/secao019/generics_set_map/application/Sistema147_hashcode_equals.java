package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.Client;

public class Sistema147_hashcode_equals {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();
		
		Client client_01 = new Client("Maria", "Maria@gmail.com");
		Client client_02 = new Client("Maria", "bob@gmail.com");
		
		System.out.println(client_01.hashCode());
		System.out.println(client_02.hashCode());
		System.out.println(client_01.equals(client_02));
		System.out.println(client_01 == client_02); // posições de memória diferentes
		
		System.out.println();
		String s1 = "Teste";
		String s2 = "Teste";
		System.out.println(s1.equals(s2));

	}

}
