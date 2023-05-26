package com.udemy.java_completo_2023_poo.secao011;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Sistema105 {

	public static void main(String[] args) {

		LocalDate ld01 = LocalDate.parse("2000-07-20");
		LocalDateTime ldt01 = LocalDateTime.parse("2000-07-20T01:30:26"); 
		Instant ins01 = Instant.parse("2000-07-20T01:30:26Z");

		DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("ld01 = ".concat(ld01.format(dtf01)));
		System.out.println("ld01 = ".concat(dtf01.format(ld01)));
		System.out.println("ld01 = ".concat(ld01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("ldt01 = ".concat(ldt01.format(dtf01)));
		System.out.println("ldt01 = ".concat(ldt01.format(dtf02)));
		
		DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("ins01 = ".concat(dtf03.format(ins01)));
		
		DateTimeFormatter dtf04 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("ldt01 = ".concat(ldt01.format(dtf04)));
		
		DateTimeFormatter dtf05 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("ins01 = ".concat(dtf05.format(ins01)));
		System.out.println("ins01 = ".concat(ins01.toString()));
		
		

	}

}
