package com.udemy.java_completo_2023_poo.secao011;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Sistema107 {

	public static void main(String[] args) {

		LocalDate ld01 = LocalDate.parse("2000-07-20");
		LocalDateTime ldt01 = LocalDateTime.parse("2000-07-20T01:30:26"); 
		Instant ins01 = Instant.parse("2000-07-20T01:30:26Z");

		LocalDate pastWeek = ld01.minusDays(7);
		LocalDate nextWeek = ld01.plusDays(7);
		LocalDate nextYear = ld01.plusYears(1);
		LocalDateTime ldtPastWeek = ldt01.minusDays(7);
		LocalDateTime ldtNextWeek = ldt01.plusDays(7);
		LocalDateTime ldtLastHourWeek = ldt01.minusHours(1);
		LocalDateTime ldtNextHourWeek = ldt01.plusHours(1);
		Instant pastWeekInstant = ins01.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = ins01.plus(7, ChronoUnit.DAYS);
		
		
		System.out.println("Semana: " + ld01.toString());
		System.out.println("Semana anterior: " + pastWeek.toString());
		System.out.println("Semana posterior: " + nextWeek.toString());
		System.out.println("Ano posterior: " + nextYear.toString());
		System.out.println("Semana anterior(LocalDateTime): " + ldtPastWeek.toString());
		System.out.println("Semana posterior(LocalDateTime): " + ldtNextWeek.toString());
		System.out.println("Hora anterior(LocalDateTime): " + ldtLastHourWeek.toString());
		System.out.println("Hora posterior(LocalDateTime): " + ldtNextHourWeek.toString());
		System.out.println("Semana anterior(Instant): " + pastWeekInstant.toString());
		System.out.println("Semana posterior(Instant): " + pastWeekInstant.toString());
		
		Duration duration = Duration.between(ins01, nextWeekInstant);
		System.out.println("Durations(Instant): " + duration.toDays());
		
		Duration duration01 = Duration.between(ld01.atTime(0,0), nextWeek.atTime(0,0));
		System.out.println("Durations(LocalDate): " + duration01.toDays());

		Duration duration02 = Duration.between(ldt01, ldtPastWeek);
		System.out.println("Durations(LocalDateTime): " + duration02.toDays());

		Duration duration03 = Duration.between(ld01.atStartOfDay(), pastWeek.atStartOfDay());
		System.out.println("Durations(LocalDate): " + duration03.toDays());

	}

}
