package com.udemy.java_completo_2023_poo.secao017.interfaces.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao017.interfaces.model.entities.boasolucao.*;

public class Sistema135 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.println("Modelo do carro: ");
		String carModel = scanner.nextLine();
		System.out.println("Retirada DD/MM/YYYY HH:MM");
		LocalDateTime start = LocalDateTime.parse(scanner.nextLine(),dtf);
		System.out.println("Entrega DD/MM/YYYY HH:MM");
		LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(),dtf);
		
		CarRental carRental  = new CarRental(start, finish, new Vehicle(carModel));

		System.out.println("Entre com o preço por hora: ");
		Double pricePerHour = scanner.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		Double pricePerDay = scanner.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());
		rentalService.processInvoice(carRental);
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + carRental.getInvoice().getTax());
		System.out.println("Pagamento total: " + carRental.getInvoice().totalPayment());
		
		scanner.close();
		
	}
	
}
