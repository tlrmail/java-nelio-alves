package com.udemy.java_completo_2023_poo.secao015.excecoes.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao015.excecoes.model.entities.ReservationSolucaoBoa;
import com.udemy.java_completo_2023_poo.secao015.excecoes.model.excecao.DomainException;

public class Sistema126 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Room number: ");
			Integer roomNumber = input.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(input.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(input.next());

			ReservationSolucaoBoa reservation = new ReservationSolucaoBoa(roomNumber, checkIn, checkOut);
			System.out.println(reservation);

			System.out.println();

			System.out.println("Enter data to Update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(input.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(input.next());

			reservation.updateDates(checkIn, checkOut);
		} catch (ParseException pe) {
			System.out.println("Invalid date format!");
		}catch (DomainException de) {
			System.out.println(de.getMessage());
		}catch(RuntimeException re) {
			System.out.println("Unexpected Error!");
		}finally {
			input.close();
		}
	}

}
