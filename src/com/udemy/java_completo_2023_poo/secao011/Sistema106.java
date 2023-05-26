package com.udemy.java_completo_2023_poo.secao011;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Sistema106 {

	public static void main(String[] args) {

		//Todos os ZoneIds
		for(String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}

		LocalDate ld01 = LocalDate.parse("2000-07-20");
		LocalDateTime ldt01 = LocalDateTime.parse("2000-07-20T01:30:26"); 
		Instant ins01 = Instant.parse("2000-07-20T01:30:26Z");

		LocalDate ld02 = LocalDate.ofInstant(ins01, ZoneId.systemDefault());
		System.out.println("ld02 = ".concat(ld02.toString()));

		LocalDate ld03 = LocalDate.ofInstant(ins01, ZoneId.of("Portugal"));
		System.out.println("ld03 = ".concat(ld03.toString()));
		
		LocalDateTime ldt02 = LocalDateTime.ofInstant(ins01, ZoneId.of("Portugal"));
		System.out.println("ldt02 = ".concat(ldt02.toString()));

		System.out.println("ld01(dia) = " + ld01.getDayOfMonth());
		System.out.println("ld01(mês) = " + ld01.getMonthValue());
		System.out.println("ld01(ano) = " + ld01.getYear());

		System.out.println("ldt01(hora) = " + ldt01.getHour());
		System.out.println("ldt01(minutos) = " + ldt01.getMinute());
		
		
	}

}
