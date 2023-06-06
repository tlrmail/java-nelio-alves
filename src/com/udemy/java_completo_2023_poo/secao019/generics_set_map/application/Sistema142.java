package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.Arrays;
import java.util.List;

public class Sistema142 {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Bob", "Alex");
		printList(myStrs);
		
	}
	
	public static void printList(List<?> list) { // List<?> list >> da erro de compilação pq não pode dar um List<Integer> para List<Object>
		for(Object i: list) {
			System.out.println(i);
		}
	}

}
