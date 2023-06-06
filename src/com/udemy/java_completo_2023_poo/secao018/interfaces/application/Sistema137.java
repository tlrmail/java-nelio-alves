package com.udemy.java_completo_2023_poo.secao018.interfaces.application;

import com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities.ComboDevice;
import com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities.ConcretePrinter;
import com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities.ConcreteScanner;

public class Sistema137 {

	public static void main(String[] args) {
		
		ConcretePrinter printer = new ConcretePrinter("1080");
		printer.processDoc("My Letter");
		printer.print("My Letter");
		
		System.out.println();
		ConcreteScanner scanner = new ConcreteScanner("2003");
		scanner.processDoc("My email");
		System.out.println("Scan result: " + scanner.scan());
		
		System.out.println();
		ComboDevice comboDevice = new ComboDevice("2081");
		comboDevice.processDoc("My Dissertation.");
		comboDevice.print("My Dissertation");
		System.out.println("Scan result: " + comboDevice.scan());
	}

}
