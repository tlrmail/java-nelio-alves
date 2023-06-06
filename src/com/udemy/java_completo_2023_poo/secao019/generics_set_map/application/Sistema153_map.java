package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.Map;
import java.util.TreeMap;

public class Sistema153_map {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "m@m");
		cookies.put("phone", "9494388492");
		System.out.println(cookies);
		
		cookies.remove("email");
		cookies.put("phone", "1133383833"); // sobrescreve o valor da chave phone
		System.out.println();
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println();
		System.out.println("ALL COOKIES: ");
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
				

	}

}
