package com.udemy.java_completo_2023_poo.secao010;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sistema098 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("José");
		list.add("Bob");
		list.add("Ana");
		list.add("Joana");
		
		for(String nome: list) {
			System.out.println(nome);
		}
		
		list.add(2, "Sarah");
		System.out.println();

		List<String> list2 = list.stream().filter(s -> s.endsWith("a")).collect(Collectors.toList());
		
		for(String nome: list) {
			System.out.println(nome);
		}

		System.out.println();
		System.out.println("Tamanho da lista: " + list.size());
		
		list.remove("Bob");
		list.remove(4);
		list.removeIf(s -> s.endsWith("a"));
		System.out.println();

		for(String nome: list) {
			System.out.println(nome);
		}
		
		System.out.println();
		for(String nome: list2) {
			System.out.println(nome);
		}
		
		
		input.close();

	}

}
