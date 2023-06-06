package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.ArrayList;
import java.util.List;

public class Sistema145_Contravariacia {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs; // super é qualquer classe acima de Numbers
											  // nesse exemplo o coringa ? pode ser tanto Number quanto Object
		
		myNums.add(3);
		myNums.add(5);
		
		// Number x = myNums.get(0); da erro de compilação
		
		/**
		 * GET - ERROR
		 * PUT - OK
		 */


	}

}
