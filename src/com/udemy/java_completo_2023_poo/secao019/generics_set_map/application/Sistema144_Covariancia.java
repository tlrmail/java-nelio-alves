package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.ArrayList;
import java.util.List;

public class Sistema144_Covariancia { // Exemplo de covariância
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		Number x = list.get(0);  // get pode, mas list.add(3); não pode pois da erro de compilação
		
		/**
		 * GET - OK
		 * PUT - ERROR
		 */
		
		 
	}

}
