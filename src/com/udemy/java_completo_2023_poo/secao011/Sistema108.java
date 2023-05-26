package com.udemy.java_completo_2023_poo.secao011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Sistema108 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d01 = sdf1.parse("18/05/2018");
		Date d02 = sdf2.parse("18/05/2018 15:12:35");
		Date d03 = new Date(0L);
		Date d04 = new Date(1000L * 60L * 60L * 5L);
		Date d05 = sdf2.parse("25/05/2018 22:32:15");
		Date d06 = Date.from(Instant.parse("2018-06-05T15:42:07Z"));
		
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf2.format(d01));
		System.out.println("x2: " + sdf2.format(d02));
		System.out.println("y1: " + sdf1.format(d01));
		System.out.println("y2: " + sdf1.format(d02));
		System.out.println("d03: " + sdf2.format(d04));
		System.out.println("d04: " + sdf2.format(d05));
		System.out.println("d05: " + sdf2.format(d05));
		System.out.println("d06: " + sdf2.format(d06));
		System.out.println("-----------------------");
		System.out.println("x1: " + d01);
		System.out.println("x2: " + d02);
		System.out.println("y1: " + d01);
		System.out.println("y2: " + d02);
		System.out.println("d03: " + d04);
		System.out.println("d04: " + d05);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf3.format(d01));
		System.out.println("x2: " + sdf3.format(d02));
		System.out.println("y1: " + sdf3.format(d01));
		System.out.println("y2: " + sdf3.format(d02));
		System.out.println("d03: " + sdf3.format(d04));
		System.out.println("d04: " + sdf3.format(d05));
		System.out.println("d05: " + sdf3.format(d05));
		System.out.println("d06: " + sdf3.format(d06));
		
		
	}

}
