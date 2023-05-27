package com.udemy.java_completo_2023_poo.secao015.excecoes.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao015.excecoes.model.entities.ReservetionSolucaoRuim;

public class Sistema125 { /** Solução RUIM */

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number: ");
		Integer roomNumber = input.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(input.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(input.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date.");
		}else {
			ReservetionSolucaoRuim reservation = new ReservetionSolucaoRuim(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			
			System.out.println();
			
			System.out.println("Enter data to Update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(input.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(input.next());
			
			Date now = new Date();
			String error = reservation.updateDates(checkIn, checkOut);
			if(error == null) {
				System.out.println(reservation);
			}else {
				System.out.println(error);
			}
			
		}
		
		
		input.close();
	}

}