package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

public class ComboDevice extends Device implements Printer, Scanner{

	public ComboDevice(String SerialNumber) {
		super(SerialNumber);
	}
	
	@Override
	public String scan() {
		return "Combo scan result.";
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo: " + doc);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}

	
	
}
