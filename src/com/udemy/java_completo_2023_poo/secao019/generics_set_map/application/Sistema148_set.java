package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sistema148_set {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("HD externo");
		
		System.out.println(set.contains("Notebook"));
		
		set.removeIf(x -> x.startsWith("T"));
		
		System.out.println();
		for(String s: set) {
			System.out.println(s);
		}
		

		Set<String> set2 = new TreeSet<>();
		
		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");
		set2.add("HD externo");
		
		System.out.println(set2.contains("Notebook"));
		
		set2.removeIf(x -> x.length() >= 3);
		
		System.out.println();
		for(String s: set2) {
			System.out.println(s);
		}
		
		
	
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		set3.add("HD externo");
		
		System.out.println(set3.contains("Notebook"));
		
		set3.remove("Tablet");
		
		System.out.println();
		for(String s: set3) {
			System.out.println(s);
		}
}

}
