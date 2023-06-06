package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner() {
		super();
	}
	
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	public String scan() {
		return "Scanned content.";
	}
}
