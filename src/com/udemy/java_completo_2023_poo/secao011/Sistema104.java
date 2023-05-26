package com.udemy.java_completo_2023_poo.secao011;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sistema104 {

	public static void main(String[] args) {

		LocalDate ld01 = LocalDate.now();  // data-hora local
		System.out.println("ld01 = ".concat(ld01.toString()));
		
		LocalDateTime ldt01 = LocalDateTime.now(); // data-hora local
		System.out.println("ldt01 = ".concat(ldt01.toString()));

		Instant i01 = Instant.now();
		System.out.println("i01 = ".concat(i01.toString())); // data-hora global gnt
		
		LocalDate ld02 = LocalDate.parse("2000-07-20");
		System.out.println("ld02 = ".concat(ld02.toString()));

		LocalDateTime ldt02 = LocalDateTime.parse("2000-07-20T01:30:26"); 
		System.out.println("ldt02 = ".concat(ldt02.toString()));

		Instant i02 = Instant.parse("2000-07-20T01:30:26Z");
		System.out.println("i02 = ".concat(i02.toString())); 
	
		Instant i03 = Instant.parse("2000-07-20T01:30:26-03:00");
		System.out.println("i03 = ".concat(i03.toString())); 

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate ld03 = LocalDate.parse("08-09-2001",dtf);
		System.out.println("ld03 = ".concat(ld03.toString()));
		
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		LocalDateTime ldt03 = LocalDateTime.parse("20-07-2000 01:30",dtf02); // data-hora local
		System.out.println("ldt03 = ".concat(ldt03.toString()));
		
		LocalDate ld04 = LocalDate.of(2023, 12, 03);            // Ano, mês e dia
		System.out.println("ld04 = ".concat(ld04.toString()));
		
		LocalDateTime ldt04 = LocalDateTime.of(2000, 12, 20, 01, 30);
		System.out.println("ldt04 = ".concat(ldt04.toString()));
	}

}
