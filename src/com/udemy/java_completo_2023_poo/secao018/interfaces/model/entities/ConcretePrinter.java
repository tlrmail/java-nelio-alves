package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter() {
		super();
	}
	
	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
