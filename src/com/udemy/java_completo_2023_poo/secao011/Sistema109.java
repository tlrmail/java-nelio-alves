package com.udemy.java_completo_2023_poo.secao011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Sistema109 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d01 = Date.from(Instant.parse("2018-05-18T12:30:45Z"));

		System.out.println(sdf1.format(d01));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d01);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		
		d01 = calendar.getTime();
		System.out.println(d01);
		System.out.println(sdf1.format(d01));
		
		int minutes = calendar.get(Calendar.MINUTE);
		int month = calendar.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
